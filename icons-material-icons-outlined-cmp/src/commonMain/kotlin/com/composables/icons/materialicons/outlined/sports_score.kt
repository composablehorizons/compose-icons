package com.composables.icons.materialicons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Outlined.Sports_score: ImageVector
    get() {
        if (_Sports_score != null) return _Sports_score!!
        
        _Sports_score = ImageVector.Builder(
            name = "sports_score",
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
                    horizontalLineToRelative(24f)
                    verticalLineToRelative(24f)
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
                        moveTo(11f, 6f)
                        horizontalLineTo(9f)
                        verticalLineTo(4f)
                        horizontalLineToRelative(2f)
                        verticalLineTo(6f)
                        close()
                        moveTo(15f, 4f)
                        horizontalLineToRelative(-2f)
                        verticalLineToRelative(2f)
                        horizontalLineToRelative(2f)
                        verticalLineTo(4f)
                        close()
                        moveTo(9f, 14f)
                        horizontalLineToRelative(2f)
                        verticalLineToRelative(-2f)
                        horizontalLineTo(9f)
                        verticalLineTo(14f)
                        close()
                        moveTo(19f, 10f)
                        verticalLineTo(8f)
                        horizontalLineToRelative(-2f)
                        verticalLineToRelative(2f)
                        horizontalLineTo(19f)
                        close()
                        moveTo(19f, 14f)
                        verticalLineToRelative(-2f)
                        horizontalLineToRelative(-2f)
                        verticalLineToRelative(2f)
                        horizontalLineTo(19f)
                        close()
                        moveTo(13f, 14f)
                        horizontalLineToRelative(2f)
                        verticalLineToRelative(-2f)
                        horizontalLineToRelative(-2f)
                        verticalLineTo(14f)
                        close()
                        moveTo(19f, 4f)
                        horizontalLineToRelative(-2f)
                        verticalLineToRelative(2f)
                        horizontalLineToRelative(2f)
                        verticalLineTo(4f)
                        close()
                        moveTo(13f, 8f)
                        verticalLineTo(6f)
                        horizontalLineToRelative(-2f)
                        verticalLineToRelative(2f)
                        horizontalLineTo(13f)
                        close()
                        moveTo(7f, 10f)
                        verticalLineTo(8f)
                        horizontalLineToRelative(2f)
                        verticalLineTo(6f)
                        horizontalLineTo(7f)
                        verticalLineTo(4f)
                        horizontalLineTo(5f)
                        verticalLineToRelative(16f)
                        horizontalLineToRelative(2f)
                        verticalLineToRelative(-8f)
                        horizontalLineToRelative(2f)
                        verticalLineToRelative(-2f)
                        horizontalLineTo(7f)
                        close()
                        moveTo(15f, 12f)
                        horizontalLineToRelative(2f)
                        verticalLineToRelative(-2f)
                        horizontalLineToRelative(-2f)
                        verticalLineTo(12f)
                        close()
                        moveTo(11f, 10f)
                        verticalLineToRelative(2f)
                        horizontalLineToRelative(2f)
                        verticalLineToRelative(-2f)
                        horizontalLineTo(11f)
                        close()
                        moveTo(9f, 8f)
                        verticalLineToRelative(2f)
                        horizontalLineToRelative(2f)
                        verticalLineTo(8f)
                        horizontalLineTo(9f)
                        close()
                        moveTo(13f, 10f)
                        horizontalLineToRelative(2f)
                        verticalLineTo(8f)
                        horizontalLineToRelative(-2f)
                        verticalLineTo(10f)
                        close()
                        moveTo(15f, 6f)
                        verticalLineToRelative(2f)
                        horizontalLineToRelative(2f)
                        verticalLineTo(6f)
                        horizontalLineTo(15f)
                        close()
                    }
                }
            }
        }.build()
        
        return _Sports_score!!
    }

private var _Sports_score: ImageVector? = null

