package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.Table: ImageVector
    get() {
        if (_Table != null) return _Table!!
        
        _Table = ImageVector.Builder(
            name = "table",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 512f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(464f, 32f)
                horizontalLineTo(48f)
                curveTo(21.49f, 32f, 0f, 53.49f, 0f, 80f)
                verticalLineToRelative(352f)
                curveToRelative(0f, 26.51f, 21.49f, 48f, 48f, 48f)
                horizontalLineToRelative(416f)
                curveToRelative(26.51f, 0f, 48f, -21.49f, 48f, -48f)
                verticalLineTo(80f)
                curveToRelative(0f, -26.51f, -21.49f, -48f, -48f, -48f)
                close()
                moveTo(224f, 416f)
                horizontalLineTo(64f)
                verticalLineToRelative(-96f)
                horizontalLineToRelative(160f)
                verticalLineToRelative(96f)
                close()
                moveToRelative(0f, -160f)
                horizontalLineTo(64f)
                verticalLineToRelative(-96f)
                horizontalLineToRelative(160f)
                verticalLineToRelative(96f)
                close()
                moveToRelative(224f, 160f)
                horizontalLineTo(288f)
                verticalLineToRelative(-96f)
                horizontalLineToRelative(160f)
                verticalLineToRelative(96f)
                close()
                moveToRelative(0f, -160f)
                horizontalLineTo(288f)
                verticalLineToRelative(-96f)
                horizontalLineToRelative(160f)
                verticalLineToRelative(96f)
                close()
            }
        }.build()
        
        return _Table!!
    }

private var _Table: ImageVector? = null

