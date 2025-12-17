package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.WifiOff: ImageVector
    get() {
        if (_WifiOff != null) return _WifiOff!!
        
        _WifiOff = ImageVector.Builder(
            name = "wifi-off",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(10.706f, 3.294f)
                arcTo(12.6f, 12.6f, 0f, false, false, 8f, 3f)
                curveTo(5.259f, 3f, 2.723f, 3.882f, 0.663f, 5.379f)
                arcToRelative(0.485f, 0.485f, 0f, false, false, -0.048f, 0.736f)
                arcToRelative(0.52f, 0.52f, 0f, false, false, 0.668f, 0.05f)
                arcTo(11.45f, 11.45f, 0f, false, true, 8f, 4f)
                quadToRelative(0.946f, 0f, 1.852f, 0.148f)
                close()
                moveTo(8f, 6f)
                curveToRelative(-1.905f, 0f, -3.68f, 0.56f, -5.166f, 1.526f)
                arcToRelative(0.48f, 0.48f, 0f, false, false, -0.063f, 0.745f)
                arcToRelative(0.525f, 0.525f, 0f, false, false, 0.652f, 0.065f)
                arcToRelative(8.45f, 8.45f, 0f, false, true, 3.51f, -1.27f)
                close()
                moveToRelative(2.596f, 1.404f)
                lineToRelative(0.785f, -0.785f)
                quadToRelative(0.947f, 0.362f, 1.785f, 0.907f)
                arcToRelative(0.482f, 0.482f, 0f, false, true, 0.063f, 0.745f)
                arcToRelative(0.525f, 0.525f, 0f, false, true, -0.652f, 0.065f)
                arcToRelative(8.5f, 8.5f, 0f, false, false, -1.98f, -0.932f)
                close()
                moveTo(8f, 10f)
                lineToRelative(0.933f, -0.933f)
                arcToRelative(6.5f, 6.5f, 0f, false, true, 2.013f, 0.637f)
                curveToRelative(0.285f, 0.145f, 0.326f, 0.524f, 0.1f, 0.75f)
                lineToRelative(-0.015f, 0.015f)
                arcToRelative(0.53f, 0.53f, 0f, false, true, -0.611f, 0.09f)
                arcTo(5.5f, 5.5f, 0f, false, false, 8f, 10f)
                moveToRelative(4.905f, -4.905f)
                lineToRelative(0.747f, -0.747f)
                quadToRelative(0.886f, 0.451f, 1.685f, 1.03f)
                arcToRelative(0.485f, 0.485f, 0f, false, true, 0.047f, 0.737f)
                arcToRelative(0.52f, 0.52f, 0f, false, true, -0.668f, 0.05f)
                arcToRelative(11.5f, 11.5f, 0f, false, false, -1.811f, -1.07f)
                moveTo(9.02f, 11.78f)
                curveToRelative(0.238f, 0.14f, 0.236f, 0.464f, 0.04f, 0.66f)
                lineToRelative(-0.707f, 0.706f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -0.707f, 0f)
                lineToRelative(-0.707f, -0.707f)
                curveToRelative(-0.195f, -0.195f, -0.197f, -0.518f, 0.04f, -0.66f)
                arcTo(2f, 2f, 0f, false, true, 8f, 11.5f)
                curveToRelative(0.374f, 0f, 0.723f, 0.102f, 1.021f, 0.28f)
                close()
                moveToRelative(4.355f, -9.905f)
                arcToRelative(0.53f, 0.53f, 0f, false, true, 0.75f, 0.75f)
                lineToRelative(-10.75f, 10.75f)
                arcToRelative(0.53f, 0.53f, 0f, false, true, -0.75f, -0.75f)
                close()
            }
        }.build()
        
        return _WifiOff!!
    }

private var _WifiOff: ImageVector? = null

