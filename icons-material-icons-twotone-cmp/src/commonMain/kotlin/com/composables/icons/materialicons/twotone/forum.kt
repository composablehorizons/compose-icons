package com.composables.icons.materialicons.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.materialicons.MaterialIcons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaterialIcons.Twotone.Forum: ImageVector
    get() {
        if (_Forum != null) return _Forum!!
        
        _Forum = ImageVector.Builder(
            name = "forum",
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
                moveTo(15f, 11f)
                verticalLineTo(4f)
                horizontalLineTo(4f)
                verticalLineToRelative(8.17f)
                lineTo(5.17f, 11f)
                horizontalLineTo(6f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(16f, 13f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                verticalLineTo(3f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                horizontalLineTo(3f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                verticalLineToRelative(14f)
                lineToRelative(4f, -4f)
                horizontalLineToRelative(10f)
                close()
                moveToRelative(-12f, -0.83f)
                verticalLineTo(4f)
                horizontalLineToRelative(11f)
                verticalLineToRelative(7f)
                horizontalLineTo(5.17f)
                lineTo(4f, 12.17f)
                close()
                moveTo(22f, 7f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(9f)
                horizontalLineTo(6f)
                verticalLineToRelative(2f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                horizontalLineToRelative(11f)
                lineToRelative(4f, 4f)
                verticalLineTo(7f)
                close()
            }
        }.build()
        
        return _Forum!!
    }

private var _Forum: ImageVector? = null

