package com.composables.icons.fontawesome.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Regular.Eye: ImageVector
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
                moveTo(288f, 144f)
                arcToRelative(110.94f, 110.94f, 0f, false, false, -31.24f, 5f)
                arcToRelative(55.4f, 55.4f, 0f, false, true, 7.24f, 27f)
                arcToRelative(56f, 56f, 0f, false, true, -56f, 56f)
                arcToRelative(55.4f, 55.4f, 0f, false, true, -27f, -7.24f)
                arcTo(111.71f, 111.71f, 0f, true, false, 288f, 144f)
                close()
                moveToRelative(284.52f, 97.4f)
                curveTo(518.29f, 135.59f, 410.93f, 64f, 288f, 64f)
                reflectiveCurveTo(57.68f, 135.64f, 3.48f, 241.41f)
                arcToRelative(32.35f, 32.35f, 0f, false, false, 0f, 29.19f)
                curveTo(57.71f, 376.41f, 165.07f, 448f, 288f, 448f)
                reflectiveCurveToRelative(230.32f, -71.64f, 284.52f, -177.41f)
                arcToRelative(32.35f, 32.35f, 0f, false, false, 0f, -29.19f)
                close()
                moveTo(288f, 400f)
                curveToRelative(-98.65f, 0f, -189.09f, -55f, -237.93f, -144f)
                curveTo(98.91f, 167f, 189.34f, 112f, 288f, 112f)
                reflectiveCurveToRelative(189.09f, 55f, 237.93f, 144f)
                curveTo(477.1f, 345f, 386.66f, 400f, 288f, 400f)
                close()
            }
        }.build()
        
        return _Eye!!
    }

private var _Eye: ImageVector? = null

