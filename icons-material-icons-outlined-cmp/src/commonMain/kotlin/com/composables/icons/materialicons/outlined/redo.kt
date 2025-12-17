package com.composables.icons.materialicons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Outlined.Redo: ImageVector
    get() {
        if (_Redo != null) return _Redo!!
        
        _Redo = ImageVector.Builder(
            name = "redo",
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
                moveTo(18.4f, 10.6f)
                curveTo(16.55f, 8.99f, 14.15f, 8f, 11.5f, 8f)
                curveToRelative(-4.65f, 0f, -8.58f, 3.03f, -9.96f, 7.22f)
                lineTo(3.9f, 16f)
                curveToRelative(1.05f, -3.19f, 4.05f, -5.5f, 7.6f, -5.5f)
                curveToRelative(1.95f, 0f, 3.73f, 0.72f, 5.12f, 1.88f)
                lineTo(13f, 16f)
                horizontalLineToRelative(9f)
                verticalLineTo(7f)
                lineToRelative(-3.6f, 3.6f)
                close()
            }
        }.build()
        
        return _Redo!!
    }

private var _Redo: ImageVector? = null

