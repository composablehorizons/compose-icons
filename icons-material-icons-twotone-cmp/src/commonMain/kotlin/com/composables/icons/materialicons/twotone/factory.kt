package com.composables.icons.materialicons.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Twotone.Factory: ImageVector
    get() {
        if (_Factory != null) return _Factory!!
        
        _Factory = ImageVector.Builder(
            name = "factory",
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
                    moveTo(12f, 12f)
                    lineToRelative(0f, -2.05f)
                    lineToRelative(-5f, 2f)
                    verticalLineTo(10f)
                    lineToRelative(-3f, 1.32f)
                    verticalLineTo(20f)
                    horizontalLineToRelative(16f)
                    verticalLineToRelative(-8f)
                    horizontalLineTo(12f)
                    close()
                    moveTo(9f, 18f)
                    horizontalLineTo(7f)
                    verticalLineToRelative(-4f)
                    horizontalLineToRelative(2f)
                    verticalLineTo(18f)
                    close()
                    moveTo(13f, 18f)
                    horizontalLineToRelative(-2f)
                    verticalLineToRelative(-4f)
                    horizontalLineToRelative(2f)
                    verticalLineTo(18f)
                    close()
                    moveTo(17f, 18f)
                    horizontalLineToRelative(-2f)
                    verticalLineToRelative(-4f)
                    horizontalLineToRelative(2f)
                    verticalLineTo(18f)
                    close()
                }
                path(
                    fill = SolidColor(Color(0xFF000000))
                ) {
                    moveTo(22f, 22f)
                    horizontalLineTo(2f)
                    verticalLineTo(10f)
                    lineToRelative(7f, -3f)
                    verticalLineToRelative(2f)
                    lineToRelative(5f, -2f)
                    lineToRelative(0f, 3f)
                    horizontalLineToRelative(3f)
                    lineToRelative(1f, -8f)
                    horizontalLineToRelative(3f)
                    lineToRelative(1f, 8f)
                    verticalLineTo(22f)
                    close()
                    moveTo(12f, 9.95f)
                    lineToRelative(-5f, 2f)
                    verticalLineTo(10f)
                    lineToRelative(-3f, 1.32f)
                    verticalLineTo(20f)
                    horizontalLineToRelative(16f)
                    verticalLineToRelative(-8f)
                    horizontalLineToRelative(-8f)
                    lineTo(12f, 9.95f)
                    close()
                    moveTo(11f, 18f)
                    horizontalLineToRelative(2f)
                    verticalLineToRelative(-4f)
                    horizontalLineToRelative(-2f)
                    verticalLineTo(18f)
                    close()
                    moveTo(7f, 18f)
                    horizontalLineToRelative(2f)
                    verticalLineToRelative(-4f)
                    horizontalLineTo(7f)
                    verticalLineTo(18f)
                    close()
                    moveTo(17f, 14f)
                    horizontalLineToRelative(-2f)
                    verticalLineToRelative(4f)
                    horizontalLineToRelative(2f)
                    verticalLineTo(14f)
                    close()
                }
            }
        }.build()
        
        return _Factory!!
    }

private var _Factory: ImageVector? = null

