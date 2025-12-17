package com.composables.icons.materialicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Filled.Smoke_free: ImageVector
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
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(2f, 6f)
                lineToRelative(6.99f, 7f)
                horizontalLineTo(2f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(9.99f)
                lineToRelative(7f, 7f)
                lineToRelative(1.26f, -1.25f)
                lineToRelative(-17f, -17f)
                close()
                moveToRelative(18.5f, 7f)
                horizontalLineTo(22f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-1.5f)
                close()
                moveTo(18f, 13f)
                horizontalLineToRelative(1.5f)
                verticalLineToRelative(3f)
                horizontalLineTo(18f)
                close()
                moveToRelative(0.85f, -8.12f)
                curveToRelative(0.62f, -0.61f, 1f, -1.45f, 1f, -2.38f)
                horizontalLineToRelative(-1.5f)
                curveToRelative(0f, 1.02f, -0.83f, 1.85f, -1.85f, 1.85f)
                verticalLineToRelative(1.5f)
                curveToRelative(2.24f, 0f, 4f, 1.83f, 4f, 4.07f)
                verticalLineTo(12f)
                horizontalLineTo(22f)
                verticalLineTo(9.92f)
                curveToRelative(0f, -2.23f, -1.28f, -4.15f, -3.15f, -5.04f)
                close()
                moveTo(14.5f, 8.7f)
                horizontalLineToRelative(1.53f)
                curveToRelative(1.05f, 0f, 1.97f, 0.74f, 1.97f, 2.05f)
                verticalLineTo(12f)
                horizontalLineToRelative(1.5f)
                verticalLineToRelative(-1.59f)
                curveToRelative(0f, -1.8f, -1.6f, -3.16f, -3.47f, -3.16f)
                horizontalLineTo(14.5f)
                curveToRelative(-1.02f, 0f, -1.85f, -0.98f, -1.85f, -2f)
                reflectiveCurveToRelative(0.83f, -1.75f, 1.85f, -1.75f)
                verticalLineTo(2f)
                curveToRelative(-1.85f, 0f, -3.35f, 1.5f, -3.35f, 3.35f)
                reflectiveCurveToRelative(1.5f, 3.35f, 3.35f, 3.35f)
                close()
                moveToRelative(2.5f, 7.23f)
                verticalLineTo(13f)
                horizontalLineToRelative(-2.93f)
                close()
            }
        }.build()
        
        return _Smoke_free!!
    }

private var _Smoke_free: ImageVector? = null

