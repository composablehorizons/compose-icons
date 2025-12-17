package com.composables.icons.materialicons.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Twotone.Drive_eta: ImageVector
    get() {
        if (_Drive_eta != null) return _Drive_eta!!
        
        _Drive_eta = ImageVector.Builder(
            name = "drive_eta",
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
                moveTo(5.12f, 11f)
                lineToRelative(-0.12f, 0.34f)
                verticalLineTo(16f)
                horizontalLineToRelative(14f)
                verticalLineToRelative(-4.66f)
                lineToRelative(-0.12f, -0.34f)
                horizontalLineTo(5.12f)
                close()
                moveToRelative(2.38f, 4f)
                curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveTo(6.67f, 12f, 7.5f, 12f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveTo(8.33f, 15f, 7.5f, 15f)
                close()
                moveToRelative(9f, 0f)
                curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(18.92f, 5.01f)
                curveTo(18.72f, 4.42f, 18.16f, 4f, 17.5f, 4f)
                horizontalLineToRelative(-11f)
                curveToRelative(-0.66f, 0f, -1.21f, 0.42f, -1.42f, 1.01f)
                lineTo(3f, 11f)
                verticalLineToRelative(8f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                horizontalLineToRelative(1f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(12f)
                verticalLineToRelative(1f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                horizontalLineToRelative(1f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                verticalLineToRelative(-8f)
                lineToRelative(-2.08f, -5.99f)
                close()
                moveTo(6.85f, 6f)
                horizontalLineToRelative(10.29f)
                lineToRelative(1.04f, 3f)
                horizontalLineTo(5.81f)
                lineToRelative(1.04f, -3f)
                close()
                moveTo(19f, 16f)
                horizontalLineTo(5f)
                verticalLineToRelative(-4.66f)
                lineToRelative(0.12f, -0.34f)
                horizontalLineToRelative(13.77f)
                lineToRelative(0.11f, 0.34f)
                verticalLineTo(16f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(9f, 13.5f)
                arcTo(1.5f, 1.5f, 0f, false, true, 7.5f, 15f)
                arcTo(1.5f, 1.5f, 0f, false, true, 6f, 13.5f)
                arcTo(1.5f, 1.5f, 0f, false, true, 9f, 13.5f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(18f, 13.5f)
                arcTo(1.5f, 1.5f, 0f, false, true, 16.5f, 15f)
                arcTo(1.5f, 1.5f, 0f, false, true, 15f, 13.5f)
                arcTo(1.5f, 1.5f, 0f, false, true, 18f, 13.5f)
                close()
            }
        }.build()
        
        return _Drive_eta!!
    }

private var _Drive_eta: ImageVector? = null

