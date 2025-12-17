package com.composables.icons.materialicons.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Rounded.How_to_vote: ImageVector
    get() {
        if (_How_to_vote != null) return _How_to_vote!!
        
        _How_to_vote = ImageVector.Builder(
            name = "how_to_vote",
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
                group {
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(18f, 12.18f)
                        lineToRelative(-1.5f, 1.64f)
                        lineToRelative(2f, 2.18f)
                        horizontalLineToRelative(-13f)
                        lineToRelative(2f, -2.18f)
                        lineTo(6f, 12.18f)
                        lineToRelative(-3f, 3.27f)
                        verticalLineTo(20f)
                        curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                        horizontalLineToRelative(14f)
                        curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                        verticalLineToRelative(-4.54f)
                        lineTo(18f, 12.18f)
                        close()
                    }
                    path(
                        fill = SolidColor(Color(0xFF000000))
                    ) {
                        moveTo(10.59f, 14.42f)
                        curveToRelative(0.78f, 0.79f, 2.05f, 0.8f, 2.84f, 0.01f)
                        lineToRelative(4.98f, -4.98f)
                        curveToRelative(0.78f, -0.78f, 0.78f, -2.05f, 0f, -2.83f)
                        lineToRelative(-3.54f, -3.53f)
                        curveToRelative(-0.78f, -0.78f, -2.05f, -0.78f, -2.83f, 0f)
                        lineTo(7.09f, 8.04f)
                        curveToRelative(-0.78f, 0.78f, -0.78f, 2.03f, -0.01f, 2.82f)
                        lineTo(10.59f, 14.42f)
                        close()
                        moveTo(13.46f, 4.5f)
                        lineToRelative(3.53f, 3.53f)
                        lineToRelative(-4.94f, 4.94f)
                        lineTo(8.52f, 9.44f)
                        lineTo(13.46f, 4.5f)
                        close()
                    }
                }
            }
        }.build()
        
        return _How_to_vote!!
    }

private var _How_to_vote: ImageVector? = null

