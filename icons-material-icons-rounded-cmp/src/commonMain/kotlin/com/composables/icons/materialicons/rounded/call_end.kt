package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Call_end: ImageVector
    get() {
        if (_Call_end != null) return _Call_end!!
        
        _Call_end = ImageVector.Builder(
            name = "call_end",
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
                moveTo(4.51f, 15.48f)
                lineToRelative(2f, -1.59f)
                curveToRelative(0.48f, -0.38f, 0.76f, -0.96f, 0.76f, -1.57f)
                verticalLineToRelative(-2.6f)
                curveToRelative(3.02f, -0.98f, 6.29f, -0.99f, 9.32f, 0f)
                verticalLineToRelative(2.61f)
                curveToRelative(0f, 0.61f, 0.28f, 1.19f, 0.76f, 1.57f)
                lineToRelative(1.99f, 1.58f)
                curveToRelative(0.8f, 0.63f, 1.94f, 0.57f, 2.66f, -0.15f)
                lineToRelative(1.22f, -1.22f)
                curveToRelative(0.8f, -0.8f, 0.8f, -2.13f, -0.05f, -2.88f)
                curveToRelative(-6.41f, -5.66f, -16.07f, -5.66f, -22.48f, 0f)
                curveToRelative(-0.85f, 0.75f, -0.85f, 2.08f, -0.05f, 2.88f)
                lineToRelative(1.22f, 1.22f)
                curveToRelative(0.71f, 0.72f, 1.85f, 0.78f, 2.65f, 0.15f)
                close()
            }
        }.build()
        
        return _Call_end!!
    }

private var _Call_end: ImageVector? = null

