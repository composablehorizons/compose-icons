package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.Xbox: ImageVector
    get() {
        if (_Xbox != null) return _Xbox!!
        
        _Xbox = ImageVector.Builder(
            name = "xbox",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(7.202f, 15.967f)
                arcToRelative(8f, 8f, 0f, false, true, -3.552f, -1.26f)
                curveToRelative(-0.898f, -0.585f, -1.101f, -0.826f, -1.101f, -1.306f)
                curveToRelative(0f, -0.965f, 1.062f, -2.656f, 2.879f, -4.583f)
                curveTo(6.459f, 7.723f, 7.897f, 6.44f, 8.052f, 6.475f)
                curveToRelative(0.302f, 0.068f, 2.718f, 2.423f, 3.622f, 3.531f)
                curveToRelative(1.43f, 1.753f, 2.088f, 3.189f, 1.754f, 3.829f)
                curveToRelative(-0.254f, 0.486f, -1.83f, 1.437f, -2.987f, 1.802f)
                curveToRelative(-0.954f, 0.301f, -2.207f, 0.429f, -3.239f, 0.33f)
                moveToRelative(-5.866f, -3.57f)
                curveTo(0.589f, 11.253f, 0.212f, 10.127f, 0.03f, 8.497f)
                curveToRelative(-0.06f, -0.539f, -0.038f, -0.846f, 0.137f, -1.95f)
                curveToRelative(0.218f, -1.377f, 1.002f, -2.97f, 1.945f, -3.95f)
                curveToRelative(0.401f, -0.417f, 0.437f, -0.427f, 0.926f, -0.263f)
                curveToRelative(0.595f, 0.2f, 1.23f, 0.638f, 2.213f, 1.528f)
                lineToRelative(0.574f, 0.519f)
                lineToRelative(-0.313f, 0.385f)
                curveTo(4.056f, 6.553f, 2.52f, 9.086f, 1.94f, 10.653f)
                curveToRelative(-0.315f, 0.852f, -0.442f, 1.707f, -0.306f, 2.063f)
                curveToRelative(0.091f, 0.24f, 0.007f, 0.15f, -0.3f, -0.319f)
                close()
                moveToRelative(13.101f, 0.195f)
                curveToRelative(0.074f, -0.36f, -0.019f, -1.02f, -0.238f, -1.687f)
                curveToRelative(-0.473f, -1.443f, -2.055f, -4.128f, -3.508f, -5.953f)
                lineToRelative(-0.457f, -0.575f)
                lineToRelative(0.494f, -0.454f)
                curveToRelative(0.646f, -0.593f, 1.095f, -0.948f, 1.58f, -1.25f)
                curveToRelative(0.381f, -0.237f, 0.927f, -0.448f, 1.161f, -0.448f)
                curveToRelative(0.145f, 0f, 0.654f, 0.528f, 1.065f, 1.104f)
                arcToRelative(8.4f, 8.4f, 0f, false, true, 1.343f, 3.102f)
                curveToRelative(0.153f, 0.728f, 0.166f, 2.286f, 0.024f, 3.012f)
                arcToRelative(9.5f, 9.5f, 0f, false, true, -0.6f, 1.893f)
                curveToRelative(-0.179f, 0.393f, -0.624f, 1.156f, -0.82f, 1.404f)
                curveToRelative(-0.1f, 0.128f, -0.1f, 0.127f, -0.043f, -0.148f)
                close()
                moveTo(7.335f, 1.952f)
                curveToRelative(-0.67f, -0.34f, -1.704f, -0.705f, -2.276f, -0.803f)
                arcToRelative(4f, 4f, 0f, false, false, -0.759f, -0.043f)
                curveToRelative(-0.471f, 0.024f, -0.45f, 0f, 0.306f, -0.358f)
                arcTo(7.8f, 7.8f, 0f, false, true, 6.47f, 0.128f)
                curveToRelative(0.8f, -0.169f, 2.306f, -0.17f, 3.094f, -0.005f)
                curveToRelative(0.85f, 0.18f, 1.853f, 0.552f, 2.418f, 0.9f)
                lineToRelative(0.168f, 0.103f)
                lineToRelative(-0.385f, -0.02f)
                curveToRelative(-0.766f, -0.038f, -1.88f, 0.27f, -3.078f, 0.853f)
                curveToRelative(-0.361f, 0.176f, -0.676f, 0.316f, -0.699f, 0.312f)
                arcToRelative(12f, 12f, 0f, false, true, -0.654f, -0.319f)
                close()
            }
        }.build()
        
        return _Xbox!!
    }

private var _Xbox: ImageVector? = null

