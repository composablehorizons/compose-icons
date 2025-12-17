package com.composables.icons.fontawesome.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.fontawesome.FontAwesome
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FontAwesome.Solid.Dog: ImageVector
    get() {
        if (_Dog != null) return _Dog!!
        
        _Dog = ImageVector.Builder(
            name = "dog",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 576f,
            viewportHeight = 512f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(298.06f, 224f)
                lineTo(448f, 277.55f)
                verticalLineTo(496f)
                arcToRelative(16f, 16f, 0f, false, true, -16f, 16f)
                horizontalLineTo(368f)
                arcToRelative(16f, 16f, 0f, false, true, -16f, -16f)
                verticalLineTo(384f)
                horizontalLineTo(192f)
                verticalLineTo(496f)
                arcToRelative(16f, 16f, 0f, false, true, -16f, 16f)
                horizontalLineTo(112f)
                arcToRelative(16f, 16f, 0f, false, true, -16f, -16f)
                verticalLineTo(282.09f)
                curveTo(58.84f, 268.84f, 32f, 233.66f, 32f, 192f)
                arcToRelative(32f, 32f, 0f, false, true, 64f, 0f)
                arcToRelative(32.06f, 32.06f, 0f, false, false, 32f, 32f)
                close()
                moveTo(544f, 112f)
                verticalLineToRelative(32f)
                arcToRelative(64f, 64f, 0f, false, true, -64f, 64f)
                horizontalLineTo(448f)
                verticalLineToRelative(35.58f)
                lineTo(320f, 197.87f)
                verticalLineTo(48f)
                curveToRelative(0f, -14.25f, 17.22f, -21.39f, 27.31f, -11.31f)
                lineTo(374.59f, 64f)
                horizontalLineToRelative(53.63f)
                curveToRelative(10.91f, 0f, 23.75f, 7.92f, 28.62f, 17.69f)
                lineTo(464f, 96f)
                horizontalLineToRelative(64f)
                arcTo(16f, 16f, 0f, false, true, 544f, 112f)
                close()
                moveToRelative(-112f, 0f)
                arcToRelative(16f, 16f, 0f, true, false, -16f, 16f)
                arcTo(16f, 16f, 0f, false, false, 432f, 112f)
                close()
            }
        }.build()
        
        return _Dog!!
    }

private var _Dog: ImageVector? = null

