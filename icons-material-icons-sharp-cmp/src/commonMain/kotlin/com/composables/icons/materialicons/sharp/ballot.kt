package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.Ballot: ImageVector
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
                moveTo(13f, 9.5f)
                horizontalLineToRelative(5f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-5f)
                verticalLineToRelative(2f)
                close()
                moveToRelative(0f, 7f)
                horizontalLineToRelative(5f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-5f)
                verticalLineToRelative(2f)
                close()
                moveToRelative(8f, 4.5f)
                horizontalLineTo(3f)
                verticalLineTo(3f)
                horizontalLineToRelative(18f)
                verticalLineToRelative(18f)
                close()
                moveTo(6f, 11f)
                horizontalLineToRelative(5f)
                verticalLineTo(6f)
                horizontalLineTo(6f)
                verticalLineToRelative(5f)
                close()
                moveToRelative(1f, -4f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(3f)
                horizontalLineTo(7f)
                verticalLineTo(7f)
                close()
                moveTo(6f, 18f)
                horizontalLineToRelative(5f)
                verticalLineToRelative(-5f)
                horizontalLineTo(6f)
                verticalLineToRelative(5f)
                close()
                moveToRelative(1f, -4f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(3f)
                horizontalLineTo(7f)
                verticalLineToRelative(-3f)
                close()
            }
        }.build()
        
        return _Ballot!!
    }

private var _Ballot: ImageVector? = null

