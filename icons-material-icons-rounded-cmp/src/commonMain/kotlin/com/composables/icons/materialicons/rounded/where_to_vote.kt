package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.Where_to_vote: ImageVector
    get() {
        if (_Where_to_vote != null) return _Where_to_vote!!
        
        _Where_to_vote = ImageVector.Builder(
            name = "where_to_vote",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            group {
                path(
                    fill = SolidColor(Color.Transparent)
                ) {
                    moveTo(0f, 0f)
                    horizontalLineTo(24f)
                    verticalLineTo(24f)
                    horizontalLineTo(0f)
                    verticalLineTo(0f)
                    close()
                }
            }
            group {
                path(
                    fill = SolidColor(Color(0xFF000000))
                ) {
                    moveTo(12f, 2f)
                    curveToRelative(-4.2f, 0f, -8f, 3.22f, -8f, 8.2f)
                    curveToRelative(0f, 3.18f, 2.45f, 6.92f, 7.34f, 11.23f)
                    curveToRelative(0.38f, 0.33f, 0.95f, 0.33f, 1.33f, 0f)
                    curveTo(17.55f, 17.12f, 20f, 13.38f, 20f, 10.2f)
                    curveTo(20f, 5.22f, 16.2f, 2f, 12f, 2f)
                    close()
                    moveTo(10.23f, 12.66f)
                    lineToRelative(-1.41f, -1.41f)
                    curveToRelative(-0.39f, -0.39f, -0.39f, -1.02f, 0f, -1.41f)
                    lineToRelative(0f, 0f)
                    curveToRelative(0.39f, -0.39f, 1.02f, -0.39f, 1.41f, 0f)
                    lineToRelative(0.71f, 0.71f)
                    lineToRelative(2.83f, -2.83f)
                    curveToRelative(0.39f, -0.39f, 1.02f, -0.39f, 1.41f, 0f)
                    lineToRelative(0f, 0f)
                    curveToRelative(0.39f, 0.39f, 0.39f, 1.02f, 0f, 1.41f)
                    lineToRelative(-3.54f, 3.54f)
                    curveTo(11.26f, 13.05f, 10.62f, 13.05f, 10.23f, 12.66f)
                    close()
                }
            }
        }.build()
        
        return _Where_to_vote!!
    }

private var _Where_to_vote: ImageVector? = null

