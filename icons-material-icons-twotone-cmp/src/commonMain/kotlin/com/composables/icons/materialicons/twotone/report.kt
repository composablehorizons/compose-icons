package com.composables.icons.materialicons.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Twotone.Report: ImageVector
    get() {
        if (_Report != null) return _Report!!
        
        _Report = ImageVector.Builder(
            name = "report",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color.Transparent)
            ) {
                moveTo(0f, 0f)
                horizontalLineToRelative(24f)
                verticalLineToRelative(24f)
                horizontalLineTo(0f)
                verticalLineTo(0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(9.1f, 5f)
                lineTo(5f, 9.1f)
                verticalLineToRelative(5.8f)
                lineTo(9.1f, 19f)
                horizontalLineToRelative(5.8f)
                lineToRelative(4.1f, -4.1f)
                verticalLineTo(9.1f)
                lineTo(14.9f, 5f)
                horizontalLineTo(9.1f)
                close()
                moveTo(12f, 17f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                reflectiveCurveToRelative(-0.45f, 1f, -1f, 1f)
                close()
                moveToRelative(1f, -3f)
                horizontalLineToRelative(-2f)
                verticalLineTo(7f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(7f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(15.73f, 3f)
                horizontalLineTo(8.27f)
                lineTo(3f, 8.27f)
                verticalLineToRelative(7.46f)
                lineTo(8.27f, 21f)
                horizontalLineToRelative(7.46f)
                lineTo(21f, 15.73f)
                verticalLineTo(8.27f)
                lineTo(15.73f, 3f)
                close()
                moveTo(19f, 14.9f)
                lineTo(14.9f, 19f)
                horizontalLineTo(9.1f)
                lineTo(5f, 14.9f)
                verticalLineTo(9.1f)
                lineTo(9.1f, 5f)
                horizontalLineToRelative(5.8f)
                lineTo(19f, 9.1f)
                verticalLineToRelative(5.8f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(13f, 16f)
                arcTo(1f, 1f, 0f, false, true, 12f, 17f)
                arcTo(1f, 1f, 0f, false, true, 11f, 16f)
                arcTo(1f, 1f, 0f, false, true, 13f, 16f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(11f, 7f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(7f)
                horizontalLineToRelative(-2f)
                close()
            }
        }.build()
        
        return _Report!!
    }

private var _Report: ImageVector? = null

