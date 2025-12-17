package com.composables.icons.materialicons.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Twotone.Content_cut: ImageVector
    get() {
        if (_Content_cut != null) return _Content_cut!!
        
        _Content_cut = ImageVector.Builder(
            name = "content_cut",
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
                moveTo(19f, 3f)
                lineToRelative(-6f, 6f)
                lineToRelative(2f, 2f)
                lineToRelative(7f, -7f)
                verticalLineTo(3f)
                close()
                moveToRelative(-9f, 3f)
                curveToRelative(0f, -2.21f, -1.79f, -4f, -4f, -4f)
                reflectiveCurveTo(2f, 3.79f, 2f, 6f)
                reflectiveCurveToRelative(1.79f, 4f, 4f, 4f)
                curveToRelative(0.59f, 0f, 1.14f, -0.13f, 1.64f, -0.36f)
                lineTo(10f, 12f)
                lineToRelative(-2.36f, 2.36f)
                curveTo(7.14f, 14.13f, 6.59f, 14f, 6f, 14f)
                curveToRelative(-2.21f, 0f, -4f, 1.79f, -4f, 4f)
                reflectiveCurveToRelative(1.79f, 4f, 4f, 4f)
                reflectiveCurveToRelative(4f, -1.79f, 4f, -4f)
                curveToRelative(0f, -0.59f, -0.13f, -1.14f, -0.36f, -1.64f)
                lineTo(12f, 14f)
                lineToRelative(7f, 7f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-1f)
                lineTo(9.64f, 7.64f)
                curveToRelative(0.23f, -0.5f, 0.36f, -1.05f, 0.36f, -1.64f)
                close()
                moveTo(6f, 8f)
                curveToRelative(-1.1f, 0f, -2f, -0.89f, -2f, -2f)
                reflectiveCurveToRelative(0.9f, -2f, 2f, -2f)
                reflectiveCurveToRelative(2f, 0.89f, 2f, 2f)
                reflectiveCurveToRelative(-0.9f, 2f, -2f, 2f)
                close()
                moveToRelative(0f, 12f)
                curveToRelative(-1.1f, 0f, -2f, -0.89f, -2f, -2f)
                reflectiveCurveToRelative(0.9f, -2f, 2f, -2f)
                reflectiveCurveToRelative(2f, 0.89f, 2f, 2f)
                reflectiveCurveToRelative(-0.9f, 2f, -2f, 2f)
                close()
                moveToRelative(6f, -8.5f)
                curveToRelative(0.28f, 0f, 0.5f, 0.22f, 0.5f, 0.5f)
                reflectiveCurveToRelative(-0.22f, 0.5f, -0.5f, 0.5f)
                reflectiveCurveToRelative(-0.5f, -0.22f, -0.5f, -0.5f)
                reflectiveCurveToRelative(0.22f, -0.5f, 0.5f, -0.5f)
                close()
            }
        }.build()
        
        return _Content_cut!!
    }

private var _Content_cut: ImageVector? = null

