package com.composables.icons.codicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Codicons.Twitter: ImageVector
    get() {
        if (_Twitter != null) return _Twitter!!
        
        _Twitter = ImageVector.Builder(
            name = "twitter",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(9.23677f, 7.004f)
                lineTo(14.0763f, 1.49939f)
                horizontalLineTo(12.9295f)
                lineTo(8.72732f, 6.27897f)
                lineTo(5.37105f, 1.49939f)
                horizontalLineTo(1.5f)
                lineTo(6.57533f, 8.72696f)
                lineTo(1.5f, 14.4994f)
                horizontalLineTo(2.64688f)
                lineTo(7.08449f, 9.45199f)
                lineTo(10.6289f, 14.4994f)
                horizontalLineTo(14.5f)
                lineTo(9.23648f, 7.004f)
                horizontalLineTo(9.23677f)
                close()
                moveTo(7.66595f, 8.79063f)
                lineTo(7.15172f, 8.07093f)
                lineTo(3.06012f, 2.34418f)
                horizontalLineTo(4.82166f)
                lineTo(8.12363f, 6.96585f)
                lineTo(8.63787f, 7.68555f)
                lineTo(12.93f, 13.693f)
                horizontalLineTo(11.1685f)
                lineTo(7.66595f, 8.79091f)
                verticalLineTo(8.79063f)
                close()
            }
        }.build()
        
        return _Twitter!!
    }

private var _Twitter: ImageVector? = null

