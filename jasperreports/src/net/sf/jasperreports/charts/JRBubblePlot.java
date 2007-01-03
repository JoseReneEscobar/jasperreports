/*
 * ============================================================================
 * GNU Lesser General Public License
 * ============================================================================
 *
 * JasperReports - Free Java report-generating library.
 * Copyright (C) 2001-2006 JasperSoft Corporation http://www.jaspersoft.com
 * 
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 2.1 of the License, or (at your option) any later version.
 * 
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 * 
 * You should have received a copy of the GNU Lesser General Public
 * License along with this library; if not, write to the Free Software
 * Foundation, Inc., 59 Temple Place, Suite 330, Boston, MA  02111-1307, USA.
 * 
 * JasperSoft Corporation
 * 303 Second Street, Suite 450 North
 * San Francisco, CA 94107
 * http://www.jaspersoft.com
 */
package net.sf.jasperreports.charts;

import java.awt.Color;

import net.sf.jasperreports.engine.JRChartPlot;
import net.sf.jasperreports.engine.JRExpression;
import net.sf.jasperreports.engine.JRFont;

/**
 * @author Flavius Sana (flavius_sana@users.sourceforge.net)
 * @version $Id$
 */
public interface JRBubblePlot extends JRChartPlot {
	
	/**
	 * 
	 */
	public JRExpression getXAxisLabelExpression();

	/**
	 * 
	 */
	public JRFont getXAxisLabelFont();
	
	/**
	 * 
	 */
	public Color getXAxisLabelColor();
	
	/**
	 * 
	 */
	public JRFont getXAxisTickLabelFont();
	
	/**
	 * 
	 */
	public Color getXAxisTickLabelColor();

	/**
	 * 
	 */
	public String getXAxisTickLabelMask();

	/**
	 * 
	 */
	public Color getXAxisLineColor();

	/**
	 * 
	 */
	public JRExpression getYAxisLabelExpression();

	/**
	 * 
	 */
	public JRFont getYAxisLabelFont();
	
	/**
	 * 
	 */
	public Color getYAxisLabelColor();
	
	/**
	 * 
	 */
	public JRFont getYAxisTickLabelFont();
	
	/**
	 * 
	 */
	public Color getYAxisTickLabelColor();

	/**
	 * 
	 */
	public String getYAxisTickLabelMask();

	/**
	 * 
	 */
	public Color getYAxisLineColor();
	
	/**
	 * 
	 */
	public int getScaleType();

	/**
	 * 
	 */
	public void setScaleType(int scaleType);
	
}
