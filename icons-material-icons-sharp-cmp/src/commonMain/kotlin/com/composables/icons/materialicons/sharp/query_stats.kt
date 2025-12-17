package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.Query_stats: ImageVector
    get() {
        if (_Query_stats != null) return _Query_stats!!
        
        _Query_stats = ImageVector.Builder(
            name = "query_stats",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
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
            group {
                path(
                    fill = SolidColor(Color(0xFF000000))
                ) {
                    moveTo(19.88f, 18.47f)
                    curveToRelative(0.44f, -0.7f, 0.7f, -1.51f, 0.7f, -2.39f)
                    curveToRelative(0f, -2.49f, -2.01f, -4.5f, -4.5f, -4.5f)
                    reflectiveCurveToRelative(-4.5f, 2.01f, -4.5f, 4.5f)
                    reflectiveCurveToRelative(2.01f, 4.5f, 4.49f, 4.5f)
                    curveToRelative(0.88f, 0f, 1.7f, -0.26f, 2.39f, -0.7f)
                    lineTo(21.58f, 23f)
                    lineTo(23f, 21.58f)
                    lineTo(19.88f, 18.47f)
                    close()
                    moveTo(16.08f, 18.58f)
                    curveToRelative(-1.38f, 0f, -2.5f, -1.12f, -2.5f, -2.5f)
                    curveToRelative(0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f)
                    reflectiveCurveToRelative(2.5f, 1.12f, 2.5f, 2.5f)
                    curveTo(18.58f, 17.46f, 17.46f, 18.58f, 16.08f, 18.58f)
                    close()
                    moveTo(15.72f, 10.08f)
                    curveToRelative(-0.74f, 0.02f, -1.45f, 0.18f, -2.1f, 0.45f)
                    lineToRelative(-0.55f, -0.83f)
                    lineToRelative(-3.8f, 6.18f)
                    lineToRelative(-3.01f, -3.52f)
                    lineToRelative(-3.63f, 5.81f)
                    lineTo(1f, 17f)
                    lineToRelative(5f, -8f)
                    lineToRelative(3f, 3.5f)
                    lineTo(13f, 6f)
                    curveTo(13f, 6f, 15.72f, 10.08f, 15.72f, 10.08f)
                    close()
                    moveTo(18.31f, 10.58f)
                    curveToRelative(-0.64f, -0.28f, -1.33f, -0.45f, -2.05f, -0.49f)
                    curveToRelative(0f, 0f, 5.12f, -8.09f, 5.12f, -8.09f)
                    lineTo(23f, 3.18f)
                    lineTo(18.31f, 10.58f)
                    close()
                }
            }
        }.build()
        
        return _Query_stats!!
    }

private var _Query_stats: ImageVector? = null

