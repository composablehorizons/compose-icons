package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Balcony: ImageVector
    get() {
        if (_Balcony != null) return _Balcony!!
        
        _Balcony = ImageVector.Builder(
            name = "balcony",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color.Transparent)
            ) {
                moveTo(0f, 0f)
                horizontalLineTo(24f)
                verticalLineTo(24f)
                horizontalLineTo(0f)
                verticalLineTo(0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(20f, 14.27f)
                verticalLineTo(10f)
                curveToRelative(0f, -4.42f, -3.58f, -8f, -8f, -8f)
                reflectiveCurveToRelative(-8f, 3.58f, -8f, 8f)
                verticalLineToRelative(4.27f)
                curveTo(3.4f, 14.61f, 3f, 15.26f, 3f, 16f)
                verticalLineToRelative(4f)
                curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                horizontalLineToRelative(14f)
                curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                verticalLineToRelative(-4f)
                curveTo(21f, 15.26f, 20.6f, 14.61f, 20f, 14.27f)
                close()
                moveTo(7f, 20f)
                horizontalLineTo(5f)
                verticalLineToRelative(-4f)
                horizontalLineToRelative(2f)
                verticalLineTo(20f)
                close()
                moveTo(11f, 20f)
                horizontalLineTo(9f)
                verticalLineToRelative(-4f)
                horizontalLineToRelative(2f)
                verticalLineTo(20f)
                close()
                moveTo(11f, 14f)
                horizontalLineTo(6f)
                verticalLineToRelative(-4f)
                curveToRelative(0f, -2.97f, 2.16f, -5.44f, 5f, -5.92f)
                verticalLineTo(14f)
                close()
                moveTo(13f, 4.08f)
                curveToRelative(2.84f, 0.48f, 5f, 2.94f, 5f, 5.92f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(-5f)
                verticalLineTo(4.08f)
                close()
                moveTo(15f, 20f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-4f)
                horizontalLineToRelative(2f)
                verticalLineTo(20f)
                close()
                moveTo(19f, 20f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-4f)
                horizontalLineToRelative(2f)
                verticalLineTo(20f)
                close()
                moveTo(8f, 11f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                reflectiveCurveToRelative(-0.45f, 1f, -1f, 1f)
                reflectiveCurveTo(8f, 11.55f, 8f, 11f)
                close()
                moveTo(16f, 11f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                reflectiveCurveTo(16f, 10.45f, 16f, 11f)
                close()
            }
        }.build()
        
        return _Balcony!!
    }

private var _Balcony: ImageVector? = null

