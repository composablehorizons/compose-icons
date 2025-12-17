package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Reply_all: ImageVector
    get() {
        if (_Reply_all != null) return _Reply_all!!
        
        _Reply_all = ImageVector.Builder(
            name = "reply_all",
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
                moveTo(7f, 7.56f)
                curveToRelative(0f, -0.94f, -1.14f, -1.42f, -1.81f, -0.75f)
                lineTo(0.71f, 11.29f)
                curveToRelative(-0.39f, 0.39f, -0.39f, 1.02f, 0f, 1.41f)
                lineToRelative(4.48f, 4.48f)
                curveToRelative(0.67f, 0.68f, 1.81f, 0.2f, 1.81f, -0.74f)
                curveToRelative(0f, -0.28f, -0.11f, -0.55f, -0.31f, -0.75f)
                lineTo(3f, 12f)
                lineToRelative(3.69f, -3.69f)
                curveToRelative(0.2f, -0.2f, 0.31f, -0.47f, 0.31f, -0.75f)
                close()
                moveTo(13f, 9f)
                verticalLineTo(7.41f)
                curveToRelative(0f, -0.89f, -1.08f, -1.34f, -1.71f, -0.71f)
                lineTo(6.7f, 11.29f)
                curveToRelative(-0.39f, 0.39f, -0.39f, 1.02f, 0f, 1.41f)
                lineToRelative(4.59f, 4.59f)
                curveToRelative(0.63f, 0.63f, 1.71f, 0.18f, 1.71f, -0.71f)
                verticalLineTo(14.9f)
                curveToRelative(5f, 0f, 8.5f, 1.6f, 11f, 5.1f)
                curveToRelative(-1f, -5f, -4f, -10f, -11f, -11f)
                close()
            }
        }.build()
        
        return _Reply_all!!
    }

private var _Reply_all: ImageVector? = null

