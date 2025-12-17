package com.composables.icons.materialicons.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Twotone.Near_me_disabled: ImageVector
    get() {
        if (_Near_me_disabled != null) return _Near_me_disabled!!
        
        _Near_me_disabled = ImageVector.Builder(
            name = "near_me_disabled",
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
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(16.1f, 10.44f)
                lineToRelative(1.5f, -4.05f)
                lineToRelative(-4.05f, 1.5f)
                lineTo(16.1f, 10.44f)
                close()
                moveTo(14.57f, 14.57f)
                lineTo(9.43f, 9.43f)
                lineToRelative(-2.71f, 1.01f)
                lineToRelative(4.89f, 1.95f)
                lineToRelative(1.95f, 4.89f)
                lineTo(14.57f, 14.57f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(12f, 6.34f)
                lineTo(21f, 3f)
                lineToRelative(-3.34f, 9f)
                lineToRelative(-1.56f, -1.56f)
                lineToRelative(1.5f, -4.05f)
                lineToRelative(-4.05f, 1.5f)
                lineTo(12f, 6.34f)
                close()
                moveTo(21.19f, 21.19f)
                lineToRelative(-5.07f, -5.07f)
                lineTo(14.31f, 21f)
                horizontalLineTo(12.9f)
                lineToRelative(-2.83f, -7.07f)
                lineTo(3f, 11.1f)
                verticalLineTo(9.69f)
                lineToRelative(4.88f, -1.81f)
                lineTo(2.81f, 2.81f)
                lineToRelative(1.41f, -1.41f)
                lineToRelative(18.38f, 18.38f)
                lineTo(21.19f, 21.19f)
                close()
                moveTo(14.57f, 14.57f)
                lineTo(9.43f, 9.43f)
                lineToRelative(-2.71f, 1.01f)
                lineToRelative(4.89f, 1.95f)
                lineToRelative(1.95f, 4.89f)
                lineTo(14.57f, 14.57f)
                close()
            }
        }.build()
        
        return _Near_me_disabled!!
    }

private var _Near_me_disabled: ImageVector? = null

