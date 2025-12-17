package com.composables.icons.bootstrap.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Fill.EmojiKiss: ImageVector
    get() {
        if (_EmojiKiss != null) return _EmojiKiss!!
        
        _EmojiKiss = ImageVector.Builder(
            name = "emoji-kiss",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(16f, 8f)
                arcToRelative(8f, 8f, 0f, true, false, -2.697f, 5.99f)
                curveToRelative(-0.972f, -0.665f, -1.632f, -1.356f, -1.99f, -2.062f)
                curveToRelative(-0.388f, -0.766f, -0.419f, -1.561f, -0.075f, -2.23f)
                curveToRelative(0.496f, -0.97f, 1.73f, -1.466f, 2.762f, -1.05f)
                curveToRelative(0.65f, -0.262f, 1.38f, -0.162f, 1.957f, 0.19f)
                quadTo(16f, 8.425f, 16f, 8f)
                moveTo(7f, 6.5f)
                curveTo(7f, 7.328f, 6.552f, 8f, 6f, 8f)
                reflectiveCurveToRelative(-1f, -0.672f, -1f, -1.5f)
                reflectiveCurveTo(5.448f, 5f, 6f, 5f)
                reflectiveCurveToRelative(1f, 0.672f, 1f, 1.5f)
                moveToRelative(1.512f, 3.647f)
                curveToRelative(-0.347f, 0.08f, -0.737f, 0.198f, -1.107f, 0.319f)
                arcToRelative(0.5f, 0.5f, 0f, true, true, -0.31f, -0.95f)
                curveToRelative(0.38f, -0.125f, 0.802f, -0.254f, 1.192f, -0.343f)
                curveToRelative(0.37f, -0.086f, 0.78f, -0.153f, 1.103f, -0.108f)
                curveToRelative(0.16f, 0.022f, 0.394f, 0.085f, 0.561f, 0.286f)
                curveToRelative(0.188f, 0.226f, 0.187f, 0.497f, 0.131f, 0.705f)
                arcToRelative(1.9f, 1.9f, 0f, false, true, -0.31f, 0.593f)
                quadToRelative(-0.115f, 0.16f, -0.275f, 0.343f)
                quadToRelative(0.16f, 0.186f, 0.276f, 0.347f)
                curveToRelative(0.142f, 0.197f, 0.256f, 0.397f, 0.31f, 0.595f)
                curveToRelative(0.055f, 0.208f, 0.056f, 0.479f, -0.132f, 0.706f)
                curveToRelative(-0.168f, 0.2f, -0.404f, 0.262f, -0.563f, 0.284f)
                curveToRelative(-0.323f, 0.043f, -0.733f, -0.027f, -1.102f, -0.113f)
                arcToRelative(15f, 15f, 0f, false, true, -1.191f, -0.345f)
                arcToRelative(0.5f, 0.5f, 0f, true, true, 0.31f, -0.95f)
                curveToRelative(0.371f, 0.12f, 0.761f, 0.24f, 1.109f, 0.321f)
                quadToRelative(0.264f, 0.062f, 0.446f, 0.084f)
                arcToRelative(6f, 6f, 0f, false, false, -0.502f, -0.584f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.002f, -0.695f)
                arcToRelative(5.5f, 5.5f, 0f, false, false, 0.5f, -0.577f)
                arcToRelative(5f, 5f, 0f, false, false, -0.448f, 0.082f)
                moveToRelative(0.766f, -0.086f)
                lineToRelative(-0.006f, -0.002f)
                close()
                moveToRelative(0.002f, 1.867f)
                lineToRelative(-0.005f, 0.001f)
                lineToRelative(0.006f, -0.002f)
                close()
                moveToRelative(0.157f, -4.685f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -0.874f, -0.486f)
                arcTo(1.93f, 1.93f, 0f, false, true, 10.25f, 5.75f)
                curveToRelative(0.73f, 0f, 1.356f, 0.412f, 1.687f, 1.007f)
                arcToRelative(0.5f, 0.5f, 0f, true, true, -0.874f, 0.486f)
                arcToRelative(0.93f, 0.93f, 0f, false, false, -0.813f, -0.493f)
                arcToRelative(0.93f, 0.93f, 0f, false, false, -0.813f, 0.493f)
                moveTo(14f, 9.828f)
                curveToRelative(1.11f, -1.14f, 3.884f, 0.856f, 0f, 3.422f)
                curveToRelative(-3.884f, -2.566f, -1.11f, -4.562f, 0f, -3.421f)
                close()
            }
        }.build()
        
        return _EmojiKiss!!
    }

private var _EmojiKiss: ImageVector? = null

