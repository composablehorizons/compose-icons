package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.Eye: ImageVector
    get() {
        if (_Eye != null) return _Eye!!
        
        _Eye = ImageVector.Builder(
            name = "eye",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 576f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(572.52f, 241.4f)
                curveTo(518.29f, 135.59f, 410.93f, 64f, 288f, 64f)
                reflectiveCurveTo(57.68f, 135.64f, 3.48f, 241.41f)
                arcToRelative(32.35f, 32.35f, 0f, false, false, 0f, 29.19f)
                curveTo(57.71f, 376.41f, 165.07f, 448f, 288f, 448f)
                reflectiveCurveToRelative(230.32f, -71.64f, 284.52f, -177.41f)
                arcToRelative(32.35f, 32.35f, 0f, false, false, 0f, -29.19f)
                close()
                moveTo(288f, 400f)
                arcToRelative(144f, 144f, 0f, true, true, 144f, -144f)
                arcToRelative(143.93f, 143.93f, 0f, false, true, -144f, 144f)
                close()
                moveToRelative(0f, -240f)
                arcToRelative(95.31f, 95.31f, 0f, false, false, -25.31f, 3.79f)
                arcToRelative(47.85f, 47.85f, 0f, false, true, -66.9f, 66.9f)
                arcTo(95.78f, 95.78f, 0f, true, false, 288f, 160f)
                close()
            }
        }.build()
        
        return _Eye!!
    }

private var _Eye: ImageVector? = null

