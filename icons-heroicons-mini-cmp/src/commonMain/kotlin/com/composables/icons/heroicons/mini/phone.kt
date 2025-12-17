package com.composables.icons.heroicons.mini

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Mini.Phone: ImageVector
    get() {
        if (_Phone != null) return _Phone!!
        
        _Phone = ImageVector.Builder(
            name = "phone",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 20f,
            viewportHeight = 20f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(2f, 3.5f)
                arcTo(1.5f, 1.5f, 0f, false, true, 3.5f, 2f)
                horizontalLineToRelative(1.148f)
                arcToRelative(1.5f, 1.5f, 0f, false, true, 1.465f, 1.175f)
                lineToRelative(0.716f, 3.223f)
                arcToRelative(1.5f, 1.5f, 0f, false, true, -1.052f, 1.767f)
                lineToRelative(-0.933f, 0.267f)
                curveToRelative(-0.41f, 0.117f, -0.643f, 0.555f, -0.48f, 0.95f)
                arcToRelative(11.542f, 11.542f, 0f, false, false, 6.254f, 6.254f)
                curveToRelative(0.395f, 0.163f, 0.833f, -0.07f, 0.95f, -0.48f)
                lineToRelative(0.267f, -0.933f)
                arcToRelative(1.5f, 1.5f, 0f, false, true, 1.767f, -1.052f)
                lineToRelative(3.223f, 0.716f)
                arcTo(1.5f, 1.5f, 0f, false, true, 18f, 15.352f)
                verticalLineTo(16.5f)
                arcToRelative(1.5f, 1.5f, 0f, false, true, -1.5f, 1.5f)
                horizontalLineTo(15f)
                curveToRelative(-1.149f, 0f, -2.263f, -0.15f, -3.326f, -0.43f)
                arcTo(13.022f, 13.022f, 0f, false, true, 2.43f, 8.326f)
                arcTo(13.019f, 13.019f, 0f, false, true, 2f, 5f)
                verticalLineTo(3.5f)
                close()
            }
        }.build()
        
        return _Phone!!
    }

private var _Phone: ImageVector? = null

