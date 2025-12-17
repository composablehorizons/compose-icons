package com.composables.icons.tabler.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Filled.Zeppelin: ImageVector
    get() {
        if (_Zeppelin != null) return _Zeppelin!!
        
        _Zeppelin = ImageVector.Builder(
            name = "zeppelin",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(13.5f, 3f)
                curveToRelative(5.187f, 0f, 9.5f, 3.044f, 9.5f, 7f)
                curveToRelative(0f, 3.017f, -2.508f, 5.503f, -6f, 6.514f)
                verticalLineToRelative(3.486f)
                arcToRelative(1f, 1f, 0f, false, true, -1f, 1f)
                horizontalLineToRelative(-6f)
                arcToRelative(1f, 1f, 0f, false, true, -1f, -1f)
                verticalLineToRelative(-4.046f)
                arcToRelative(21f, 21f, 0f, false, true, -2.66f, -1.411f)
                lineToRelative(-0.13f, -0.082f)
                lineToRelative(-1.57f, 1.308f)
                arcToRelative(1f, 1f, 0f, false, true, -1.634f, -0.656f)
                lineToRelative(-0.006f, -0.113f)
                verticalLineToRelative(-2.851f)
                lineToRelative(-0.31f, -0.25f)
                arcToRelative(47f, 47f, 0f, false, true, -0.682f, -0.568f)
                lineToRelative(-0.67f, -0.582f)
                arcToRelative(1f, 1f, 0f, false, true, 0f, -1.498f)
                arcToRelative(47f, 47f, 0f, false, true, 1.351f, -1.151f)
                lineToRelative(0.311f, -0.25f)
                verticalLineToRelative(-2.85f)
                arcToRelative(1f, 1f, 0f, false, true, 1.55f, -0.836f)
                lineToRelative(0.09f, 0.068f)
                lineToRelative(1.57f, 1.307f)
                lineToRelative(0.128f, -0.08f)
                curveToRelative(2.504f, -1.553f, 4.784f, -2.378f, 6.853f, -2.453f)
                close()
                moveToRelative(-2.499f, 13.657f)
                lineToRelative(-0.001f, 2.343f)
                horizontalLineToRelative(4f)
                lineToRelative(0.001f, -2.086f)
                quadToRelative(-0.735f, 0.086f, -1.501f, 0.086f)
                arcToRelative(9.6f, 9.6f, 0f, false, true, -2.13f, -0.252f)
                close()
            }
        }.build()
        
        return _Zeppelin!!
    }

private var _Zeppelin: ImageVector? = null

