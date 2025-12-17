package com.composables.icons.materialicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Filled.Ballot: ImageVector
    get() {
        if (_Ballot != null) return _Ballot!!
        
        _Ballot = ImageVector.Builder(
            name = "ballot",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color.Transparent),
                pathFillType = PathFillType.EvenOdd
            ) {
                moveTo(0f, 0f)
                horizontalLineTo(24f)
                verticalLineTo(24f)
                horizontalLineTo(0f)
                verticalLineTo(0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(13f, 9.5f)
                horizontalLineToRelative(5f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-5f)
                verticalLineTo(9.5f)
                close()
                moveTo(13f, 16.5f)
                horizontalLineToRelative(5f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-5f)
                verticalLineTo(16.5f)
                close()
                moveTo(19f, 21f)
                horizontalLineTo(5f)
                curveToRelative(-1.1f, 0f, -2f, -0.9f, -2f, -2f)
                verticalLineTo(5f)
                curveToRelative(0f, -1.1f, 0.9f, -2f, 2f, -2f)
                horizontalLineToRelative(14f)
                curveToRelative(1.1f, 0f, 2f, 0.9f, 2f, 2f)
                verticalLineToRelative(14f)
                curveTo(21f, 20.1f, 20.1f, 21f, 19f, 21f)
                close()
                moveTo(6f, 11f)
                horizontalLineToRelative(5f)
                verticalLineTo(6f)
                horizontalLineTo(6f)
                verticalLineTo(11f)
                close()
                moveTo(7f, 7f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(3f)
                horizontalLineTo(7f)
                verticalLineTo(7f)
                close()
                moveTo(6f, 18f)
                horizontalLineToRelative(5f)
                verticalLineToRelative(-5f)
                horizontalLineTo(6f)
                verticalLineTo(18f)
                close()
                moveTo(7f, 14f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(3f)
                horizontalLineTo(7f)
                verticalLineTo(14f)
                close()
            }
        }.build()
        
        return _Ballot!!
    }

private var _Ballot: ImageVector? = null

