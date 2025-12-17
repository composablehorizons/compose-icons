package com.composables.icons.materialicons.outlined

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Outlined.Home_work: ImageVector
    get() {
        if (_Home_work != null) return _Home_work!!
        
        _Home_work = ImageVector.Builder(
            name = "home_work",
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
                moveTo(17f, 15f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-2f)
                close()
                moveTo(17f, 11f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-2f)
                close()
                moveTo(17f, 7f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-2f)
                close()
                moveTo(13.74f, 7f)
                lineToRelative(1.26f, 0.84f)
                verticalLineTo(7f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(10f, 3f)
                verticalLineToRelative(1.51f)
                lineToRelative(2f, 1.33f)
                verticalLineTo(5f)
                horizontalLineToRelative(9f)
                verticalLineToRelative(14f)
                horizontalLineToRelative(-4f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(6f)
                verticalLineTo(3f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(8.17f, 5.7f)
                lineTo(15f, 10.25f)
                verticalLineTo(21f)
                horizontalLineTo(1f)
                verticalLineTo(10.48f)
                lineTo(8.17f, 5.7f)
                close()
                moveTo(10f, 19f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-7.84f)
                lineTo(8.17f, 8.09f)
                lineTo(3f, 11.38f)
                verticalLineTo(19f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-6f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(6f)
                close()
            }
        }.build()
        
        return _Home_work!!
    }

private var _Home_work: ImageVector? = null

