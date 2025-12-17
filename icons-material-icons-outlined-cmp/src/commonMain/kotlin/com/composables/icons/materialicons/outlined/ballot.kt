package com.composables.icons.materialicons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Outlined.Ballot: ImageVector
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
                moveTo(13f, 7.5f)
                horizontalLineToRelative(5f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-5f)
                close()
                moveToRelative(0f, 7f)
                horizontalLineToRelative(5f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-5f)
                close()
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
                moveToRelative(0f, 16f)
                horizontalLineTo(5f)
                verticalLineTo(5f)
                horizontalLineToRelative(14f)
                verticalLineToRelative(14f)
                close()
                moveTo(11f, 6f)
                horizontalLineTo(6f)
                verticalLineToRelative(5f)
                horizontalLineToRelative(5f)
                verticalLineTo(6f)
                close()
                moveToRelative(-1f, 4f)
                horizontalLineTo(7f)
                verticalLineTo(7f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(3f)
                close()
                moveToRelative(1f, 3f)
                horizontalLineTo(6f)
                verticalLineToRelative(5f)
                horizontalLineToRelative(5f)
                verticalLineToRelative(-5f)
                close()
                moveToRelative(-1f, 4f)
                horizontalLineTo(7f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(3f)
                close()
            }
        }.build()
        
        return _Ballot!!
    }

private var _Ballot: ImageVector? = null

