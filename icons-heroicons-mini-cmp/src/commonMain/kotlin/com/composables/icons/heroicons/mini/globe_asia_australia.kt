package com.composables.icons.heroicons.mini

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Mini.GlobeAsiaAustralia: ImageVector
    get() {
        if (_GlobeAsiaAustralia != null) return _GlobeAsiaAustralia!!
        
        _GlobeAsiaAustralia = ImageVector.Builder(
            name = "globe-asia-australia",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 20f,
            viewportHeight = 20f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(18f, 10f)
                arcToRelative(8f, 8f, 0f, true, true, -16f, 0f)
                arcToRelative(8f, 8f, 0f, false, true, 16f, 0f)
                close()
                moveToRelative(-6.5f, 6.326f)
                arcToRelative(6.52f, 6.52f, 0f, false, true, -1.5f, 0.174f)
                arcToRelative(6.487f, 6.487f, 0f, false, true, -5.011f, -2.36f)
                lineToRelative(0.49f, -0.98f)
                arcToRelative(0.423f, 0.423f, 0f, false, true, 0.614f, -0.164f)
                lineToRelative(0.294f, 0.196f)
                arcToRelative(0.992f, 0.992f, 0f, false, false, 1.491f, -1.139f)
                lineToRelative(-0.197f, -0.593f)
                arcToRelative(0.252f, 0.252f, 0f, false, true, 0.126f, -0.304f)
                lineToRelative(1.973f, -0.987f)
                arcToRelative(0.938f, 0.938f, 0f, false, false, 0.361f, -1.359f)
                arcToRelative(0.375f, 0.375f, 0f, false, true, 0.239f, -0.576f)
                lineToRelative(0.125f, -0.025f)
                arcTo(2.421f, 2.421f, 0f, false, false, 12.327f, 6.6f)
                lineToRelative(0.05f, -0.149f)
                arcToRelative(1f, 1f, 0f, false, false, -0.242f, -1.023f)
                lineToRelative(-1.489f, -1.489f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -0.146f, -0.353f)
                verticalLineToRelative(-0.067f)
                arcToRelative(6.5f, 6.5f, 0f, false, true, 5.392f, 9.23f)
                arcToRelative(1.398f, 1.398f, 0f, false, false, -0.68f, -0.244f)
                lineToRelative(-0.566f, -0.566f)
                arcToRelative(1.5f, 1.5f, 0f, false, false, -1.06f, -0.439f)
                horizontalLineToRelative(-0.172f)
                arcToRelative(1.5f, 1.5f, 0f, false, false, -1.06f, 0.44f)
                lineToRelative(-0.593f, 0.592f)
                arcToRelative(0.501f, 0.501f, 0f, false, true, -0.13f, 0.093f)
                lineToRelative(-1.578f, 0.79f)
                arcToRelative(1f, 1f, 0f, false, false, -0.553f, 0.894f)
                verticalLineToRelative(0.191f)
                arcToRelative(1f, 1f, 0f, false, false, 1f, 1f)
                horizontalLineToRelative(0.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.5f, 0.5f)
                verticalLineToRelative(0.326f)
                close()
            }
        }.build()
        
        return _GlobeAsiaAustralia!!
    }

private var _GlobeAsiaAustralia: ImageVector? = null

