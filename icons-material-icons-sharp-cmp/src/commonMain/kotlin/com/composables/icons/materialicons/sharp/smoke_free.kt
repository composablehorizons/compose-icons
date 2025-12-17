package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.Smoke_free: ImageVector
    get() {
        if (_Smoke_free != null) return _Smoke_free!!
        
        _Smoke_free = ImageVector.Builder(
            name = "smoke_free",
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
                moveTo(20.5f, 13f)
                horizontalLineTo(22f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-1.5f)
                close()
                moveToRelative(-6f, -4.35f)
                horizontalLineToRelative(1.53f)
                curveToRelative(1.05f, 0f, 1.97f, 0.74f, 1.97f, 2.05f)
                verticalLineTo(12f)
                horizontalLineToRelative(1.5f)
                verticalLineToRelative(-1.64f)
                curveToRelative(0f, -1.81f, -1.6f, -3.16f, -3.47f, -3.16f)
                horizontalLineTo(14.5f)
                curveToRelative(-1.02f, 0f, -1.85f, -0.98f, -1.85f, -2f)
                reflectiveCurveToRelative(0.83f, -1.75f, 1.85f, -1.75f)
                verticalLineToRelative(-1.5f)
                curveToRelative(-1.85f, 0f, -3.35f, 1.5f, -3.35f, 3.35f)
                reflectiveCurveToRelative(1.5f, 3.35f, 3.35f, 3.35f)
                close()
                moveTo(17f, 13f)
                horizontalLineToRelative(-2.34f)
                lineTo(17f, 15.34f)
                close()
                moveToRelative(1.85f, -8.27f)
                curveToRelative(0.62f, -0.61f, 1f, -1.45f, 1f, -2.38f)
                horizontalLineToRelative(-1.5f)
                curveToRelative(0f, 1.02f, -0.83f, 1.85f, -1.85f, 1.85f)
                verticalLineToRelative(1.5f)
                curveToRelative(2.24f, 0f, 4f, 1.83f, 4f, 4.07f)
                verticalLineTo(12f)
                horizontalLineTo(22f)
                verticalLineTo(9.76f)
                curveToRelative(0f, -2.22f, -1.28f, -4.14f, -3.15f, -5.03f)
                close()
                moveTo(18f, 13f)
                horizontalLineToRelative(1.5f)
                verticalLineToRelative(3f)
                horizontalLineTo(18f)
                close()
                moveTo(3.41f, 4.59f)
                lineTo(2f, 6f)
                lineToRelative(7f, 7f)
                horizontalLineTo(2f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(10f)
                lineToRelative(7f, 7f)
                lineToRelative(1.41f, -1.41f)
                close()
            }
        }.build()
        
        return _Smoke_free!!
    }

private var _Smoke_free: ImageVector? = null

