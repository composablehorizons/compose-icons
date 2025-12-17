package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Report_gmailerrorred: ImageVector
    get() {
        if (_Report_gmailerrorred != null) return _Report_gmailerrorred!!
        
        _Report_gmailerrorred = ImageVector.Builder(
            name = "report_gmailerrorred",
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
                moveTo(20.71f, 7.98f)
                lineTo(16.03f, 3.3f)
                curveToRelative(-0.19f, -0.19f, -0.45f, -0.3f, -0.71f, -0.3f)
                horizontalLineTo(8.68f)
                curveToRelative(-0.26f, 0f, -0.52f, 0.11f, -0.7f, 0.29f)
                lineTo(3.29f, 7.98f)
                curveToRelative(-0.18f, 0.18f, -0.29f, 0.44f, -0.29f, 0.7f)
                verticalLineToRelative(6.63f)
                curveToRelative(0f, 0.27f, 0.11f, 0.52f, 0.29f, 0.71f)
                lineToRelative(4.68f, 4.68f)
                curveToRelative(0.19f, 0.19f, 0.45f, 0.3f, 0.71f, 0.3f)
                horizontalLineToRelative(6.63f)
                curveToRelative(0.27f, 0f, 0.52f, -0.11f, 0.71f, -0.29f)
                lineToRelative(4.68f, -4.68f)
                curveToRelative(0.19f, -0.19f, 0.29f, -0.44f, 0.29f, -0.71f)
                verticalLineTo(8.68f)
                curveToRelative(0.01f, -0.26f, -0.1f, -0.52f, -0.28f, -0.7f)
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
                moveTo(12f, 7f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                verticalLineToRelative(5f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                reflectiveCurveToRelative(1f, -0.45f, 1f, -1f)
                verticalLineTo(8f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                close()
            }
        }.build()
        
        return _Report_gmailerrorred!!
    }

private var _Report_gmailerrorred: ImageVector? = null

