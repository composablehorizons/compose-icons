package com.composables.icons.materialicons.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Twotone.Local_taxi: ImageVector
    get() {
        if (_Local_taxi != null) return _Local_taxi!!
        
        _Local_taxi = ImageVector.Builder(
            name = "local_taxi",
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
                moveTo(5.12f, 12f)
                lineToRelative(-0.12f, 0.34f)
                verticalLineTo(17f)
                horizontalLineToRelative(14f)
                verticalLineToRelative(-4.66f)
                lineToRelative(-0.12f, -0.34f)
                horizontalLineTo(5.12f)
                close()
                moveToRelative(2.38f, 4f)
                curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveTo(6.67f, 13f, 7.5f, 13f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveTo(8.33f, 16f, 7.5f, 16f)
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
                moveTo(17.5f, 5f)
                horizontalLineTo(15f)
                verticalLineTo(3f)
                horizontalLineTo(9f)
                verticalLineToRelative(2f)
                horizontalLineTo(6.5f)
                curveToRelative(-0.66f, 0f, -1.21f, 0.42f, -1.42f, 1.01f)
                lineTo(3f, 12f)
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
                curveTo(18.72f, 5.42f, 18.16f, 5f, 17.5f, 5f)
                close()
                moveTo(6.85f, 7f)
                horizontalLineToRelative(10.29f)
                lineToRelative(1.04f, 3f)
                horizontalLineTo(5.81f)
                lineToRelative(1.04f, -3f)
                close()
                moveTo(19f, 17f)
                horizontalLineTo(5f)
                verticalLineToRelative(-4.66f)
                lineToRelative(0.12f, -0.34f)
                horizontalLineToRelative(13.77f)
                lineToRelative(0.11f, 0.34f)
                verticalLineTo(17f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(9f, 14.5f)
                arcTo(1.5f, 1.5f, 0f, false, true, 7.5f, 16f)
                arcTo(1.5f, 1.5f, 0f, false, true, 6f, 14.5f)
                arcTo(1.5f, 1.5f, 0f, false, true, 9f, 14.5f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(18f, 14.5f)
                arcTo(1.5f, 1.5f, 0f, false, true, 16.5f, 16f)
                arcTo(1.5f, 1.5f, 0f, false, true, 15f, 14.5f)
                arcTo(1.5f, 1.5f, 0f, false, true, 18f, 14.5f)
                close()
            }
        }.build()
        
        return _Local_taxi!!
    }

private var _Local_taxi: ImageVector? = null

