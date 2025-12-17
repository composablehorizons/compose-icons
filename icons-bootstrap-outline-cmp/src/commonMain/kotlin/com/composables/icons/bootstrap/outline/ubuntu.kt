package com.composables.icons.bootstrap.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Outline.Ubuntu: ImageVector
    get() {
        if (_Ubuntu != null) return _Ubuntu!!
        
        _Ubuntu = ImageVector.Builder(
            name = "ubuntu",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(2.273f, 9.53f)
                arcToRelative(2.273f, 2.273f, 0f, true, false, 0f, -4.546f)
                arcToRelative(2.273f, 2.273f, 0f, false, false, 0f, 4.547f)
                close()
                moveToRelative(9.467f, -4.984f)
                arcToRelative(2.273f, 2.273f, 0f, true, false, 0f, -4.546f)
                arcToRelative(2.273f, 2.273f, 0f, false, false, 0f, 4.546f)
                moveTo(7.4f, 13.108f)
                arcToRelative(5.54f, 5.54f, 0f, false, true, -3.775f, -2.88f)
                arcToRelative(3.27f, 3.27f, 0f, false, true, -1.944f, 0.24f)
                arcToRelative(7.4f, 7.4f, 0f, false, false, 5.328f, 4.465f)
                curveToRelative(0.53f, 0.113f, 1.072f, 0.169f, 1.614f, 0.166f)
                arcToRelative(3.25f, 3.25f, 0f, false, true, -0.666f, -1.9f)
                arcToRelative(6f, 6f, 0f, false, true, -0.557f, -0.091f)
                moveToRelative(3.828f, 2.285f)
                arcToRelative(2.273f, 2.273f, 0f, true, false, 0f, -4.546f)
                arcToRelative(2.273f, 2.273f, 0f, false, false, 0f, 4.546f)
                moveToRelative(3.163f, -3.108f)
                arcToRelative(7.44f, 7.44f, 0f, false, false, 0.373f, -8.726f)
                arcToRelative(3.3f, 3.3f, 0f, false, true, -1.278f, 1.498f)
                arcToRelative(5.57f, 5.57f, 0f, false, true, -0.183f, 5.535f)
                arcToRelative(3.26f, 3.26f, 0f, false, true, 1.088f, 1.693f)
                moveTo(2.098f, 3.998f)
                arcToRelative(3.3f, 3.3f, 0f, false, true, 1.897f, 0.486f)
                arcToRelative(5.54f, 5.54f, 0f, false, true, 4.464f, -2.388f)
                curveToRelative(0.037f, -0.67f, 0.277f, -1.313f, 0.69f, -1.843f)
                arcToRelative(7.47f, 7.47f, 0f, false, false, -7.051f, 3.745f)
            }
        }.build()
        
        return _Ubuntu!!
    }

private var _Ubuntu: ImageVector? = null

