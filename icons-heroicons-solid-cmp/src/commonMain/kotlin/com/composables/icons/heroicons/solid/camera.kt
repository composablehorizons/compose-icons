package com.composables.icons.heroicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Solid.Camera: ImageVector
    get() {
        if (_Camera != null) return _Camera!!
        
        _Camera = ImageVector.Builder(
            name = "camera",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(12f, 9f)
                arcToRelative(3.75f, 3.75f, 0f, true, false, 0f, 7.5f)
                arcTo(3.75f, 3.75f, 0f, false, false, 12f, 9f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(9.344f, 3.071f)
                arcToRelative(49.52f, 49.52f, 0f, false, true, 5.312f, 0f)
                curveToRelative(0.967f, 0.052f, 1.83f, 0.585f, 2.332f, 1.39f)
                lineToRelative(0.821f, 1.317f)
                curveToRelative(0.24f, 0.383f, 0.645f, 0.643f, 1.11f, 0.71f)
                curveToRelative(0.386f, 0.054f, 0.77f, 0.113f, 1.152f, 0.177f)
                curveToRelative(1.432f, 0.239f, 2.429f, 1.493f, 2.429f, 2.909f)
                verticalLineTo(18f)
                arcToRelative(3f, 3f, 0f, false, true, -3f, 3f)
                horizontalLineToRelative(-15f)
                arcToRelative(3f, 3f, 0f, false, true, -3f, -3f)
                verticalLineTo(9.574f)
                curveToRelative(0f, -1.416f, 0.997f, -2.67f, 2.429f, -2.909f)
                curveToRelative(0.382f, -0.064f, 0.766f, -0.123f, 1.151f, -0.178f)
                arcToRelative(1.56f, 1.56f, 0f, false, false, 1.11f, -0.71f)
                lineToRelative(0.822f, -1.315f)
                arcToRelative(2.942f, 2.942f, 0f, false, true, 2.332f, -1.39f)
                close()
                moveTo(6.75f, 12.75f)
                arcToRelative(5.25f, 5.25f, 0f, true, true, 10.5f, 0f)
                arcToRelative(5.25f, 5.25f, 0f, false, true, -10.5f, 0f)
                close()
                moveToRelative(12f, -1.5f)
                arcToRelative(0.75f, 0.75f, 0f, true, false, 0f, -1.5f)
                arcToRelative(0.75f, 0.75f, 0f, false, false, 0f, 1.5f)
                close()
            }
        }.build()
        
        return _Camera!!
    }

private var _Camera: ImageVector? = null

