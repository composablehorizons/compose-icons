package com.composables.icons.bootstrap.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import com.composables.icons.bootstrap.Bootstrap
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bootstrap.Fill.SignTurnSlightRight: ImageVector
    get() {
        if (_SignTurnSlightRight != null) return _SignTurnSlightRight!!
        
        _SignTurnSlightRight = ImageVector.Builder(
            name = "sign-turn-slight-right",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 16f,
            viewportHeight = 16f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(6.95f, 0.435f)
                curveToRelative(0.58f, -0.58f, 1.52f, -0.58f, 2.1f, 0f)
                lineToRelative(6.515f, 6.516f)
                curveToRelative(0.58f, 0.58f, 0.58f, 1.519f, 0f, 2.098f)
                lineTo(9.05f, 15.565f)
                curveToRelative(-0.58f, 0.58f, -1.519f, 0.58f, -2.098f, 0f)
                lineTo(0.435f, 9.05f)
                arcToRelative(1.48f, 1.48f, 0f, false, true, 0f, -2.098f)
                close()
                moveToRelative(1.385f, 6.547f)
                lineToRelative(0.8f, 1.386f)
                arcToRelative(0.25f, 0.25f, 0f, false, false, 0.451f, -0.039f)
                lineToRelative(1.06f, -2.882f)
                arcToRelative(0.25f, 0.25f, 0f, false, false, -0.192f, -0.333f)
                lineToRelative(-3.026f, -0.523f)
                arcToRelative(0.25f, 0.25f, 0f, false, false, -0.26f, 0.371f)
                lineToRelative(0.667f, 1.154f)
                lineToRelative(-0.621f, 0.373f)
                arcTo(2.5f, 2.5f, 0f, false, false, 6f, 8.632f)
                verticalLineTo(11f)
                horizontalLineToRelative(1f)
                verticalLineTo(8.632f)
                arcToRelative(1.5f, 1.5f, 0f, false, true, 0.728f, -1.286f)
                close()
            }
        }.build()
        
        return _SignTurnSlightRight!!
    }

private var _SignTurnSlightRight: ImageVector? = null

