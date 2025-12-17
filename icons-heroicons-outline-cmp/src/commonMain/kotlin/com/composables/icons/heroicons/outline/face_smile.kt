package com.composables.icons.heroicons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeJoin
import com.composables.icons.heroicons.Heroicons
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Heroicons.Outline.FaceSmile: ImageVector
    get() {
        if (_FaceSmile != null) return _FaceSmile!!
        
        _FaceSmile = ImageVector.Builder(
            name = "face-smile",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f
        ).apply {
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f,
                strokeLineJoin = StrokeJoin.Miter
            ) {
                moveTo(15.182f, 15.182f)
                arcToRelative(4.5f, 4.5f, 0f, false, true, -6.364f, 0f)
                moveTo(21f, 12f)
                arcToRelative(9f, 9f, 0f, true, true, -18f, 0f)
                arcToRelative(9f, 9f, 0f, false, true, 18f, 0f)
                close()
                moveTo(9.75f, 9.75f)
                curveToRelative(0f, 0.414f, -0.168f, 0.75f, -0.375f, 0.75f)
                reflectiveCurveTo(9f, 10.164f, 9f, 9.75f)
                reflectiveCurveTo(9.168f, 9f, 9.375f, 9f)
                reflectiveCurveToRelative(0.375f, 0.336f, 0.375f, 0.75f)
                close()
                moveToRelative(-0.375f, 0f)
                horizontalLineToRelative(0.008f)
                verticalLineToRelative(0.015f)
                horizontalLineToRelative(-0.008f)
                verticalLineTo(9.75f)
                close()
                moveToRelative(5.625f, 0f)
                curveToRelative(0f, 0.414f, -0.168f, 0.75f, -0.375f, 0.75f)
                reflectiveCurveToRelative(-0.375f, -0.336f, -0.375f, -0.75f)
                reflectiveCurveToRelative(0.168f, -0.75f, 0.375f, -0.75f)
                reflectiveCurveToRelative(0.375f, 0.336f, 0.375f, 0.75f)
                close()
                moveToRelative(-0.375f, 0f)
                horizontalLineToRelative(0.008f)
                verticalLineToRelative(0.015f)
                horizontalLineToRelative(-0.008f)
                verticalLineTo(9.75f)
                close()
            }
        }.build()
        
        return _FaceSmile!!
    }

private var _FaceSmile: ImageVector? = null

