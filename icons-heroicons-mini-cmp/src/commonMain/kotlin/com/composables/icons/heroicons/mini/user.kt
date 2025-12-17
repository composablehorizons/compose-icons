package com.composables.icons.heroicons.mini

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Mini.User: ImageVector
    get() {
        if (_User != null) return _User!!
        
        _User = ImageVector.Builder(
            name = "user",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 20f,
            viewportHeight = 20f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(10f, 8f)
                arcToRelative(3f, 3f, 0f, true, false, 0f, -6f)
                arcToRelative(3f, 3f, 0f, false, false, 0f, 6f)
                close()
                moveTo(3.465f, 14.493f)
                arcToRelative(1.23f, 1.23f, 0f, false, false, 0.41f, 1.412f)
                arcTo(9.957f, 9.957f, 0f, false, false, 10f, 18f)
                curveToRelative(2.31f, 0f, 4.438f, -0.784f, 6.131f, -2.1f)
                curveToRelative(0.43f, -0.333f, 0.604f, -0.903f, 0.408f, -1.41f)
                arcToRelative(7.002f, 7.002f, 0f, false, false, -13.074f, 0.003f)
                close()
            }
        }.build()
        
        return _User!!
    }

private var _User: ImageVector? = null

