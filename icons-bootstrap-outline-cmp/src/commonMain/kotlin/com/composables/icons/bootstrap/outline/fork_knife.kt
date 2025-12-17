package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.ForkKnife: ImageVector
    get() {
        if (_ForkKnife != null) return _ForkKnife!!
        
        _ForkKnife = ImageVector.Builder(
            name = "fork-knife",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(13f, 0.5f)
                curveToRelative(0f, -0.276f, -0.226f, -0.506f, -0.498f, -0.465f)
                curveToRelative(-1.703f, 0.257f, -2.94f, 2.012f, -3f, 8.462f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0.498f, 0.5f)
                curveToRelative(0.56f, 0.01f, 1f, 0.13f, 1f, 1.003f)
                verticalLineToRelative(5.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0.5f, 0.5f)
                horizontalLineToRelative(1f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0.5f, -0.5f)
                close()
                moveTo(4.25f, 0f)
                arcToRelative(0.25f, 0.25f, 0f, false, true, 0.25f, 0.25f)
                verticalLineToRelative(5.122f)
                arcToRelative(0.128f, 0.128f, 0f, false, false, 0.256f, 0.006f)
                lineToRelative(0.233f, -5.14f)
                arcTo(0.25f, 0.25f, 0f, false, true, 5.24f, 0f)
                horizontalLineToRelative(0.522f)
                arcToRelative(0.25f, 0.25f, 0f, false, true, 0.25f, 0.238f)
                lineToRelative(0.233f, 5.14f)
                arcToRelative(0.128f, 0.128f, 0f, false, false, 0.256f, -0.006f)
                verticalLineTo(0.25f)
                arcTo(0.25f, 0.25f, 0f, false, true, 6.75f, 0f)
                horizontalLineToRelative(0.29f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0.498f, 0.458f)
                lineToRelative(0.423f, 5.07f)
                arcToRelative(1.69f, 1.69f, 0f, false, true, -1.059f, 1.711f)
                lineToRelative(-0.053f, 0.022f)
                arcToRelative(0.92f, 0.92f, 0f, false, false, -0.58f, 0.884f)
                lineTo(6.47f, 15f)
                arcToRelative(0.971f, 0.971f, 0f, true, true, -1.942f, 0f)
                lineToRelative(0.202f, -6.855f)
                arcToRelative(0.92f, 0.92f, 0f, false, false, -0.58f, -0.884f)
                lineToRelative(-0.053f, -0.022f)
                arcToRelative(1.69f, 1.69f, 0f, false, true, -1.059f, -1.712f)
                lineTo(3.462f, 0.458f)
                arcTo(0.5f, 0.5f, 0f, false, true, 3.96f, 0f)
                close()
            }
        }.build()
        
        return _ForkKnife!!
    }

private var _ForkKnife: ImageVector? = null

