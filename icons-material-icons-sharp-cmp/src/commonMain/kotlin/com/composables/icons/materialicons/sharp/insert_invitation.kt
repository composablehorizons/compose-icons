package com.composables.icons.materialicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Sharp.Insert_invitation: ImageVector
    get() {
        if (_Insert_invitation != null) return _Insert_invitation!!
        
        _Insert_invitation = ImageVector.Builder(
            name = "insert_invitation",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(17f, 12f)
                horizontalLineToRelative(-5f)
                verticalLineToRelative(5f)
                horizontalLineToRelative(5f)
                verticalLineToRelative(-5f)
                close()
                moveTo(16f, 1f)
                verticalLineToRelative(2f)
                horizontalLineTo(8f)
                verticalLineTo(1f)
                horizontalLineTo(6f)
                verticalLineToRelative(2f)
                horizontalLineTo(3.01f)
                verticalLineToRelative(18f)
                horizontalLineTo(21f)
                verticalLineTo(3f)
                horizontalLineToRelative(-3f)
                verticalLineTo(1f)
                horizontalLineToRelative(-2f)
                close()
                moveToRelative(3f, 18f)
                horizontalLineTo(5f)
                verticalLineTo(8f)
                horizontalLineToRelative(14f)
                verticalLineToRelative(11f)
                close()
            }
        }.build()
        
        return _Insert_invitation!!
    }

private var _Insert_invitation: ImageVector? = null

