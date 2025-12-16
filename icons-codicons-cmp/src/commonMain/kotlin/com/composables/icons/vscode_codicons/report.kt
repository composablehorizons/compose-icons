package com.composables.icons.codicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Codicons.Report: ImageVector
    get() {
        if (_Report != null) return _Report!!
        
        _Report = ImageVector.Builder(
            name = "report",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(7.508f, 4.41049f)
                lineTo(7.5f, 4.50049f)
                verticalLineTo(7.00049f)
                lineTo(7.508f, 7.09049f)
                curveTo(7.55f, 7.32349f, 7.754f, 7.50049f, 8f, 7.50049f)
                curveTo(8.246f, 7.50049f, 8.45f, 7.32349f, 8.492f, 7.09049f)
                lineTo(8.5f, 7.00049f)
                verticalLineTo(4.50049f)
                lineTo(8.492f, 4.41049f)
                curveTo(8.45f, 4.17749f, 8.246f, 4.00049f, 8f, 4.00049f)
                curveTo(7.754f, 4.00049f, 7.55f, 4.17749f, 7.508f, 4.41049f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(7.25f, 9.25049f)
                curveTo(7.25f, 9.66449f, 7.586f, 10.0005f, 8f, 10.0005f)
                curveTo(8.414f, 10.0005f, 8.75f, 9.66449f, 8.75f, 9.25049f)
                curveTo(8.75f, 8.83649f, 8.414f, 8.50049f, 8f, 8.50049f)
                curveTo(7.586f, 8.50049f, 7.25f, 8.83649f, 7.25f, 9.25049f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(2.5f, 2.00049f)
                horizontalLineTo(13.5f)
                curveTo(14.33f, 2.00049f, 15f, 2.67049f, 15f, 3.50049f)
                verticalLineTo(10.5005f)
                curveTo(15f, 11.3305f, 14.33f, 12.0005f, 13.5f, 12.0005f)
                horizontalLineTo(8.69f)
                lineTo(5.63f, 14.6805f)
                curveTo(4.99f, 15.2305f, 4f, 14.7805f, 4f, 13.9405f)
                verticalLineTo(12.0005f)
                horizontalLineTo(2.5f)
                curveTo(1.67f, 12.0005f, 1f, 11.3305f, 1f, 10.5005f)
                verticalLineTo(3.50049f)
                curveTo(1f, 2.67049f, 1.67f, 2.00049f, 2.5f, 2.00049f)
                close()
                moveTo(13.5f, 11.0005f)
                curveTo(13.78f, 11.0005f, 14f, 10.7805f, 14f, 10.5005f)
                verticalLineTo(3.50049f)
                curveTo(14f, 3.22049f, 13.78f, 3.00049f, 13.5f, 3.00049f)
                horizontalLineTo(2.5f)
                curveTo(2.22f, 3.00049f, 2f, 3.22049f, 2f, 3.50049f)
                verticalLineTo(10.5005f)
                curveTo(2f, 10.7805f, 2.22f, 11.0005f, 2.5f, 11.0005f)
                horizontalLineTo(5f)
                verticalLineTo(13.9005f)
                lineTo(8.31f, 11.0005f)
                horizontalLineTo(13.5f)
                close()
            }
        }.build()
        
        return _Report!!
    }

private var _Report: ImageVector? = null

