package com.composables.icons.materialicons.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Twotone.Textsms: ImageVector
    get() {
        if (_Textsms != null) return _Textsms!!
        
        _Textsms = ImageVector.Builder(
            name = "textsms",
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
                moveTo(4f, 18f)
                lineToRelative(2f, -2f)
                horizontalLineToRelative(14f)
                verticalLineTo(4f)
                horizontalLineTo(4f)
                verticalLineToRelative(14f)
                close()
                moveToRelative(11f, -9f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-2f)
                verticalLineTo(9f)
                close()
                moveToRelative(-4f, 0f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-2f)
                verticalLineTo(9f)
                close()
                moveTo(7f, 9f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(2f)
                horizontalLineTo(7f)
                verticalLineTo(9f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(20f, 2f)
                horizontalLineTo(4f)
                curveToRelative(-1.1f, 0f, -2f, 0.9f, -2f, 2f)
                verticalLineToRelative(18f)
                lineToRelative(4f, -4f)
                horizontalLineToRelative(14f)
                curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                verticalLineTo(4f)
                curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
                close()
                moveToRelative(0f, 14f)
                horizontalLineTo(6f)
                lineToRelative(-2f, 2f)
                verticalLineTo(4f)
                horizontalLineToRelative(16f)
                verticalLineToRelative(12f)
                close()
                moveTo(7f, 9f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(2f)
                horizontalLineTo(7f)
                close()
                moveToRelative(4f, 0f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-2f)
                close()
                moveToRelative(4f, 0f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-2f)
                close()
            }
        }.build()
        
        return _Textsms!!
    }

private var _Textsms: ImageVector? = null

