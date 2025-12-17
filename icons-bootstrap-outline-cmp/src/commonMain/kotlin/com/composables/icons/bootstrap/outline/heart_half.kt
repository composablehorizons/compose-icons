package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.HeartHalf: ImageVector
    get() {
        if (_HeartHalf != null) return _HeartHalf!!
        
        _HeartHalf = ImageVector.Builder(
            name = "heart-half",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(8f, 2.748f)
                verticalLineToRelative(11.047f)
                curveToRelative(3.452f, -2.368f, 5.365f, -4.542f, 6.286f, -6.357f)
                curveToRelative(0.955f, -1.886f, 0.838f, -3.362f, 0.314f, -4.385f)
                curveTo(13.486f, 0.878f, 10.4f, 0.28f, 8.717f, 2.01f)
                close()
                moveTo(8f, 15f)
                curveTo(-7.333f, 4.868f, 3.279f, -3.04f, 7.824f, 1.143f)
                quadToRelative(0.09f, 0.083f, 0.176f, 0.171f)
                arcToRelative(3f, 3f, 0f, false, true, 0.176f, -0.17f)
                curveTo(12.72f, -3.042f, 23.333f, 4.867f, 8f, 15f)
            }
        }.build()
        
        return _HeartHalf!!
    }

private var _HeartHalf: ImageVector? = null

