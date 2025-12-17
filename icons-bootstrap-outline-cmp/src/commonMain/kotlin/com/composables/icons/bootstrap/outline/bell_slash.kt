package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.BellSlash: ImageVector
    get() {
        if (_BellSlash != null) return _BellSlash!!
        
        _BellSlash = ImageVector.Builder(
            name = "bell-slash",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(5.164f, 14f)
                horizontalLineTo(15f)
                curveToRelative(-0.299f, -0.199f, -0.557f, -0.553f, -0.78f, -1f)
                curveToRelative(-0.9f, -1.8f, -1.22f, -5.12f, -1.22f, -6f)
                quadToRelative(0f, -0.396f, -0.06f, -0.776f)
                lineToRelative(-0.938f, 0.938f)
                curveToRelative(0.02f, 0.708f, 0.157f, 2.154f, 0.457f, 3.58f)
                curveToRelative(0.161f, 0.767f, 0.377f, 1.566f, 0.663f, 2.258f)
                horizontalLineTo(6.164f)
                close()
                moveToRelative(5.581f, -9.91f)
                arcToRelative(4f, 4f, 0f, false, false, -1.948f, -1.01f)
                lineTo(8f, 2.917f)
                lineToRelative(-0.797f, 0.161f)
                arcTo(4f, 4f, 0f, false, false, 4f, 7f)
                curveToRelative(0f, 0.628f, -0.134f, 2.197f, -0.459f, 3.742f)
                quadToRelative(-0.075f, 0.358f, -0.166f, 0.718f)
                lineToRelative(-1.653f, 1.653f)
                quadToRelative(0.03f, -0.055f, 0.059f, -0.113f)
                curveTo(2.679f, 11.2f, 3f, 7.88f, 3f, 7f)
                curveToRelative(0f, -2.42f, 1.72f, -4.44f, 4.005f, -4.901f)
                arcToRelative(1f, 1f, 0f, true, true, 1.99f, 0f)
                curveToRelative(0.942f, 0.19f, 1.788f, 0.645f, 2.457f, 1.284f)
                close()
                moveTo(10f, 15f)
                arcToRelative(2f, 2f, 0f, true, true, -4f, 0f)
                close()
                moveToRelative(-9.375f, 0.625f)
                arcToRelative(0.53f, 0.53f, 0f, false, false, 0.75f, 0.75f)
                lineToRelative(14.75f, -14.75f)
                arcToRelative(0.53f, 0.53f, 0f, false, false, -0.75f, -0.75f)
                close()
            }
        }.build()
        
        return _BellSlash!!
    }

private var _BellSlash: ImageVector? = null

