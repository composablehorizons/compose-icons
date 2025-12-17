package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Done_all: ImageVector
    get() {
        if (_Done_all != null) return _Done_all!!
        
        _Done_all = ImageVector.Builder(
            name = "done_all",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color.Transparent)
            ) {
                moveTo(0f, 0f)
                horizontalLineToRelative(24f)
                verticalLineToRelative(24f)
                horizontalLineTo(0f)
                verticalLineTo(0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(17.3f, 6.3f)
                curveToRelative(-0.39f, -0.39f, -1.02f, -0.39f, -1.41f, 0f)
                lineToRelative(-5.64f, 5.64f)
                lineToRelative(1.41f, 1.41f)
                lineTo(17.3f, 7.7f)
                curveToRelative(0.38f, -0.38f, 0.38f, -1.02f, 0f, -1.4f)
                close()
                moveToRelative(4.24f, -0.01f)
                lineToRelative(-9.88f, 9.88f)
                lineToRelative(-3.48f, -3.47f)
                curveToRelative(-0.39f, -0.39f, -1.02f, -0.39f, -1.41f, 0f)
                curveToRelative(-0.39f, 0.39f, -0.39f, 1.02f, 0f, 1.41f)
                lineToRelative(4.18f, 4.18f)
                curveToRelative(0.39f, 0.39f, 1.02f, 0.39f, 1.41f, 0f)
                lineTo(22.95f, 7.71f)
                curveToRelative(0.39f, -0.39f, 0.39f, -1.02f, 0f, -1.41f)
                horizontalLineToRelative(-0.01f)
                curveToRelative(-0.38f, -0.4f, -1.01f, -0.4f, -1.4f, -0.01f)
                close()
                moveTo(1.12f, 14.12f)
                lineTo(5.3f, 18.3f)
                curveToRelative(0.39f, 0.39f, 1.02f, 0.39f, 1.41f, 0f)
                lineToRelative(0.7f, -0.7f)
                lineToRelative(-4.88f, -4.9f)
                curveToRelative(-0.39f, -0.39f, -1.02f, -0.39f, -1.41f, 0f)
                curveToRelative(-0.39f, 0.39f, -0.39f, 1.03f, 0f, 1.42f)
                close()
            }
        }.build()
        
        return _Done_all!!
    }

private var _Done_all: ImageVector? = null

