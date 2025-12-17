package com.composables.icons.materialicons.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Twotone.Report_off: ImageVector
    get() {
        if (_Report_off != null) return _Report_off!!
        
        _Report_off = ImageVector.Builder(
            name = "report_off",
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
                moveTo(19f, 9.1f)
                lineTo(14.9f, 5f)
                horizontalLineTo(9.1f)
                lineToRelative(-0.22f, 0.22f)
                lineTo(11f, 7.33f)
                verticalLineTo(7f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(2.33f)
                lineToRelative(5.78f, 5.79f)
                lineToRelative(0.22f, -0.22f)
                close()
                moveTo(6.05f, 8.04f)
                lineTo(5f, 9.1f)
                verticalLineToRelative(5.8f)
                lineTo(9.1f, 19f)
                horizontalLineToRelative(5.8f)
                lineToRelative(1.05f, -1.05f)
                lineToRelative(-9.9f, -9.91f)
                close()
                moveTo(13f, 16f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(9.1f, 5f)
                horizontalLineToRelative(5.8f)
                lineTo(19f, 9.1f)
                verticalLineToRelative(5.8f)
                lineToRelative(-0.22f, 0.22f)
                lineToRelative(1.42f, 1.41f)
                lineToRelative(0.8f, -0.8f)
                verticalLineTo(8.27f)
                lineTo(15.73f, 3f)
                horizontalLineTo(8.27f)
                lineToRelative(-0.8f, 0.8f)
                lineToRelative(1.41f, 1.42f)
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
                moveTo(13f, 7f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(0.33f)
                lineToRelative(2f, 2f)
                close()
                moveTo(2.41f, 1.58f)
                lineTo(1f, 2.99f)
                lineToRelative(3.64f, 3.64f)
                lineTo(3f, 8.27f)
                verticalLineToRelative(7.46f)
                lineTo(8.27f, 21f)
                horizontalLineToRelative(7.46f)
                lineToRelative(1.64f, -1.64f)
                lineTo(21.01f, 23f)
                lineToRelative(1.41f, -1.41f)
                lineTo(2.41f, 1.58f)
                close()
                moveTo(14.9f, 19f)
                horizontalLineTo(9.1f)
                lineTo(5f, 14.9f)
                verticalLineTo(9.1f)
                lineToRelative(1.05f, -1.05f)
                lineToRelative(9.9f, 9.9f)
                lineTo(14.9f, 19f)
                close()
            }
        }.build()
        
        return _Report_off!!
    }

private var _Report_off: ImageVector? = null

