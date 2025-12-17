package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.Smoking_rooms: ImageVector
    get() {
        if (_Smoking_rooms != null) return _Smoking_rooms!!
        
        _Smoking_rooms = ImageVector.Builder(
            name = "smoking_rooms",
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
                moveTo(2f, 16f)
                horizontalLineToRelative(15f)
                verticalLineToRelative(3f)
                horizontalLineTo(2f)
                verticalLineToRelative(-3f)
                close()
                moveToRelative(18.5f, 0f)
                horizontalLineTo(22f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-1.5f)
                verticalLineToRelative(-3f)
                close()
                moveTo(18f, 16f)
                horizontalLineToRelative(1.5f)
                verticalLineToRelative(3f)
                horizontalLineTo(18f)
                verticalLineToRelative(-3f)
                close()
                moveToRelative(0.85f, -8.27f)
                curveToRelative(0.62f, -0.61f, 1f, -1.45f, 1f, -2.38f)
                curveTo(19.85f, 3.5f, 18.35f, 2f, 16.5f, 2f)
                verticalLineToRelative(1.5f)
                curveToRelative(1.02f, 0f, 1.85f, 0.83f, 1.85f, 1.85f)
                reflectiveCurveTo(17.52f, 7.2f, 16.5f, 7.2f)
                verticalLineToRelative(1.5f)
                curveToRelative(2.24f, 0f, 4f, 1.83f, 4f, 4.07f)
                verticalLineTo(15f)
                horizontalLineTo(22f)
                verticalLineToRelative(-2.24f)
                curveToRelative(0f, -2.22f, -1.28f, -4.14f, -3.15f, -5.03f)
                close()
                moveToRelative(-2.82f, 2.47f)
                horizontalLineTo(14.5f)
                curveToRelative(-1.02f, 0f, -1.85f, -0.98f, -1.85f, -2f)
                reflectiveCurveToRelative(0.83f, -1.75f, 1.85f, -1.75f)
                verticalLineToRelative(-1.5f)
                curveToRelative(-1.85f, 0f, -3.35f, 1.5f, -3.35f, 3.35f)
                reflectiveCurveToRelative(1.5f, 3.35f, 3.35f, 3.35f)
                horizontalLineToRelative(1.53f)
                curveToRelative(1.05f, 0f, 1.97f, 0.74f, 1.97f, 2.05f)
                verticalLineTo(15f)
                horizontalLineToRelative(1.5f)
                verticalLineToRelative(-1.64f)
                curveToRelative(0f, -1.81f, -1.6f, -3.16f, -3.47f, -3.16f)
                close()
            }
        }.build()
        
        return _Smoking_rooms!!
    }

private var _Smoking_rooms: ImageVector? = null

