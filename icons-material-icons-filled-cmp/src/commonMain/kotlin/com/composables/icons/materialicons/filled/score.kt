package com.composables.icons.materialicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Filled.Score: ImageVector
    get() {
        if (_Score != null) return _Score!!
        
        _Score = ImageVector.Builder(
            name = "score",
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
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(19f, 3f)
                horizontalLineTo(5f)
                curveToRelative(-1.1f, 0f, -2f, 0.9f, -2f, 2f)
                verticalLineToRelative(14f)
                curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                horizontalLineToRelative(14f)
                curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                verticalLineTo(5f)
                curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
                close()
                moveToRelative(-7f, 2f)
                horizontalLineToRelative(1.5f)
                verticalLineToRelative(3f)
                lineToRelative(2f, -3f)
                horizontalLineToRelative(1.7f)
                lineToRelative(-2f, 3f)
                lineToRelative(2f, 3f)
                horizontalLineToRelative(-1.7f)
                lineToRelative(-2f, -3f)
                verticalLineToRelative(3f)
                horizontalLineTo(12f)
                verticalLineTo(5f)
                close()
                moveTo(7f, 7.25f)
                horizontalLineToRelative(2.5f)
                verticalLineTo(6.5f)
                horizontalLineTo(7f)
                verticalLineTo(5f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(3.75f)
                horizontalLineTo(8.5f)
                verticalLineToRelative(0.75f)
                horizontalLineTo(11f)
                verticalLineTo(11f)
                horizontalLineTo(7f)
                verticalLineTo(7.25f)
                close()
                moveTo(19f, 13f)
                lineToRelative(-6f, 6f)
                lineToRelative(-4f, -4f)
                lineToRelative(-4f, 4f)
                verticalLineToRelative(-2.5f)
                lineToRelative(4f, -4f)
                lineToRelative(4f, 4f)
                lineToRelative(6f, -6f)
                verticalLineTo(13f)
                close()
            }
        }.build()
        
        return _Score!!
    }

private var _Score: ImageVector? = null

