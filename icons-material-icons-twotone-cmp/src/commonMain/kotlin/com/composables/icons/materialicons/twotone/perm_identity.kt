package com.composables.icons.materialicons.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Twotone.Perm_identity: ImageVector
    get() {
        if (_Perm_identity != null) return _Perm_identity!!
        
        _Perm_identity = ImageVector.Builder(
            name = "perm_identity",
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
                moveTo(14f, 8f)
                arcTo(2f, 2f, 0f, false, true, 12f, 10f)
                arcTo(2f, 2f, 0f, false, true, 10f, 8f)
                arcTo(2f, 2f, 0f, false, true, 14f, 8f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(12f, 15f)
                curveToRelative(-2.7f, 0f, -5.8f, 1.29f, -6f, 2.01f)
                verticalLineTo(18f)
                horizontalLineToRelative(12f)
                verticalLineToRelative(-1f)
                curveToRelative(-0.2f, -0.71f, -3.3f, -2f, -6f, -2f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(12f, 12f)
                curveToRelative(2.21f, 0f, 4f, -1.79f, 4f, -4f)
                reflectiveCurveToRelative(-1.79f, -4f, -4f, -4f)
                reflectiveCurveToRelative(-4f, 1.79f, -4f, 4f)
                reflectiveCurveToRelative(1.79f, 4f, 4f, 4f)
                close()
                moveToRelative(0f, -6f)
                curveToRelative(1.1f, 0f, 2f, 0.9f, 2f, 2f)
                reflectiveCurveToRelative(-0.9f, 2f, -2f, 2f)
                reflectiveCurveToRelative(-2f, -0.9f, -2f, -2f)
                reflectiveCurveToRelative(0.9f, -2f, 2f, -2f)
                close()
                moveToRelative(0f, 7f)
                curveToRelative(-2.67f, 0f, -8f, 1.34f, -8f, 4f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(16f)
                verticalLineToRelative(-3f)
                curveToRelative(0f, -2.66f, -5.33f, -4f, -8f, -4f)
                close()
                moveToRelative(6f, 5f)
                horizontalLineTo(6f)
                verticalLineToRelative(-0.99f)
                curveToRelative(0.2f, -0.72f, 3.3f, -2.01f, 6f, -2.01f)
                reflectiveCurveToRelative(5.8f, 1.29f, 6f, 2f)
                verticalLineToRelative(1f)
                close()
            }
        }.build()
        
        return _Perm_identity!!
    }

private var _Perm_identity: ImageVector? = null

