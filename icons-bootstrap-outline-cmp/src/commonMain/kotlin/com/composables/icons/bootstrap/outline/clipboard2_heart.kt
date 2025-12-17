package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.Clipboard2Heart: ImageVector
    get() {
        if (_Clipboard2Heart != null) return _Clipboard2Heart!!
        
        _Clipboard2Heart = ImageVector.Builder(
            name = "clipboard2-heart",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(10.058f, 0.501f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, -0.5f, -0.501f)
                horizontalLineToRelative(-2.98f)
                curveToRelative(-0.276f, 0f, -0.5f, 0.225f, -0.5f, 0.501f)
                arcTo(0.5f, 0.5f, 0f, false, true, 5.582f, 1f)
                arcToRelative(0.497f, 0.497f, 0f, false, false, -0.497f, 0.497f)
                verticalLineTo(2f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0.5f, 0.5f)
                horizontalLineToRelative(4.968f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0.5f, -0.5f)
                verticalLineToRelative(-0.503f)
                arcTo(0.497f, 0.497f, 0f, false, false, 10.555f, 1f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, -0.497f, -0.499f)
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(3.605f, 2f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, -0.5f, 0.5f)
                verticalLineToRelative(12f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0.5f, 0.5f)
                horizontalLineToRelative(9f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, 0.5f, -0.5f)
                verticalLineToRelative(-12f)
                arcToRelative(0.5f, 0.5f, 0f, false, false, -0.5f, -0.5f)
                horizontalLineToRelative(-0.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0f, -1f)
                horizontalLineToRelative(0.5f)
                arcToRelative(1.5f, 1.5f, 0f, false, true, 1.5f, 1.5f)
                verticalLineToRelative(12f)
                arcToRelative(1.5f, 1.5f, 0f, false, true, -1.5f, 1.5f)
                horizontalLineToRelative(-9f)
                arcToRelative(1.5f, 1.5f, 0f, false, true, -1.5f, -1.5f)
                verticalLineToRelative(-12f)
                arcToRelative(1.5f, 1.5f, 0f, false, true, 1.5f, -1.5f)
                horizontalLineToRelative(0.5f)
                arcToRelative(0.5f, 0.5f, 0f, false, true, 0f, 1f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(8.068f, 6.482f)
                curveToRelative(1.656f, -1.673f, 5.795f, 1.254f, 0f, 5.018f)
                curveToRelative(-5.795f, -3.764f, -1.656f, -6.69f, 0f, -5.018f)
            }
        }.build()
        
        return _Clipboard2Heart!!
    }

private var _Clipboard2Heart: ImageVector? = null

