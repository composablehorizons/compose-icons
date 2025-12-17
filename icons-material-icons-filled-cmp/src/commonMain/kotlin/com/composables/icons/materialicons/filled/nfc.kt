package com.composables.icons.materialicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Filled.Nfc: ImageVector
    get() {
        if (_Nfc != null) return _Nfc!!
        
        _Nfc = ImageVector.Builder(
            name = "nfc",
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
                fill = SolidColor(Color.Transparent)
            ) {
                moveTo(4f, 20f)
                horizontalLineToRelative(16f)
                verticalLineTo(4f)
                horizontalLineTo(4f)
                verticalLineToRelative(16f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(20f, 2f)
                horizontalLineTo(4f)
                curveToRelative(-1.1f, 0f, -2f, 0.9f, -2f, 2f)
                verticalLineToRelative(16f)
                curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                horizontalLineToRelative(16f)
                curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                verticalLineTo(4f)
                curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
                close()
                moveToRelative(0f, 18f)
                horizontalLineTo(4f)
                verticalLineTo(4f)
                horizontalLineToRelative(16f)
                verticalLineToRelative(16f)
                close()
                moveTo(18f, 6f)
                horizontalLineToRelative(-5f)
                curveToRelative(-1.1f, 0f, -2f, 0.9f, -2f, 2f)
                verticalLineToRelative(2.28f)
                curveToRelative(-0.6f, 0.35f, -1f, 0.98f, -1f, 1.72f)
                curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                reflectiveCurveToRelative(2f, -0.9f, 2f, -2f)
                curveToRelative(0f, -0.74f, -0.4f, -1.38f, -1f, -1.72f)
                verticalLineTo(8f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(8f)
                horizontalLineTo(8f)
                verticalLineTo(8f)
                horizontalLineToRelative(2f)
                verticalLineTo(6f)
                horizontalLineTo(6f)
                verticalLineToRelative(12f)
                horizontalLineToRelative(12f)
                verticalLineTo(6f)
                close()
            }
        }.build()
        
        return _Nfc!!
    }

private var _Nfc: ImageVector? = null

