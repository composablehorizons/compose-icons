package com.composables.icons.materialicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Filled.Leaderboard: ImageVector
    get() {
        if (_Leaderboard != null) return _Leaderboard!!
        
        _Leaderboard = ImageVector.Builder(
            name = "leaderboard",
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
                    moveTo(7.5f, 21f)
                    horizontalLineTo(2f)
                    verticalLineTo(9f)
                    horizontalLineToRelative(5.5f)
                    verticalLineTo(21f)
                    close()
                    moveTo(14.75f, 3f)
                    horizontalLineToRelative(-5.5f)
                    verticalLineToRelative(18f)
                    horizontalLineToRelative(5.5f)
                    verticalLineTo(3f)
                    close()
                    moveTo(22f, 11f)
                    horizontalLineToRelative(-5.5f)
                    verticalLineToRelative(10f)
                    horizontalLineTo(22f)
                    verticalLineTo(11f)
                    close()
                }
            }
        }.build()
        
        return _Leaderboard!!
    }

private var _Leaderboard: ImageVector? = null

