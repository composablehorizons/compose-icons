package com.composables.icons.tabler.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.tabler.Tabler
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tabler.Filled.Affiliate: ImageVector
    get() {
        if (_Affiliate != null) return _Affiliate!!
        
        _Affiliate = ImageVector.Builder(
            name = "affiliate",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(18.5f, 3f)
                arcToRelative(2.5f, 2.5f, 0f, true, true, -0.912f, 4.828f)
                lineToRelative(-4.556f, 4.555f)
                arcToRelative(5.475f, 5.475f, 0f, false, true, 0.936f, 3.714f)
                lineToRelative(2.624f, 0.787f)
                arcToRelative(2.5f, 2.5f, 0f, true, true, -0.575f, 1.916f)
                lineToRelative(-2.623f, -0.788f)
                arcToRelative(5.5f, 5.5f, 0f, false, true, -10.39f, -2.29f)
                lineToRelative(-0.004f, -0.222f)
                lineToRelative(0.004f, -0.221f)
                arcToRelative(5.5f, 5.5f, 0f, false, true, 2.984f, -4.673f)
                lineToRelative(-0.788f, -2.624f)
                arcToRelative(2.498f, 2.498f, 0f, false, true, -2.194f, -2.304f)
                lineToRelative(-0.006f, -0.178f)
                lineToRelative(0.005f, -0.164f)
                arcToRelative(2.5f, 2.5f, 0f, true, true, 4.111f, 2.071f)
                lineToRelative(0.787f, 2.625f)
                arcToRelative(5.475f, 5.475f, 0f, false, true, 3.714f, 0.936f)
                lineToRelative(4.555f, -4.556f)
                arcToRelative(2.487f, 2.487f, 0f, false, true, -0.167f, -0.748f)
                lineToRelative(-0.005f, -0.164f)
                lineToRelative(0.005f, -0.164f)
                arcToRelative(2.5f, 2.5f, 0f, false, true, 2.495f, -2.336f)
                close()
            }
        }.build()
        
        return _Affiliate!!
    }

private var _Affiliate: ImageVector? = null

